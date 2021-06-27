package com.jisan.studio.service;

import com.jisan.studio.domain.MemberVO;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface MemberDetailsService extends UserDetailsService {

    public String addUser(MemberVO memberVO);
}
