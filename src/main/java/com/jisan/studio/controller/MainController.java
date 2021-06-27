package com.jisan.studio.controller;

import com.jisan.studio.domain.MemberDao;
import com.jisan.studio.domain.MemberVO;
import com.jisan.studio.service.MemberDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private MemberDetailsService memberService;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/login")
    public String loginView() {

        return "login";
    }

    @GetMapping("/signup")
    public String signUpView() {

        return "signup";
    }

    @PostMapping("/signup")
    public String signup(MemberVO member) {

        System.out.println(member.getMemberId());
        memberService.addUser(member);

        return "redirect:/";
    }
}
