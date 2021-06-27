package com.jisan.studio.service;

import java.util.Optional;

import com.jisan.studio.domain.MemberDao;
import com.jisan.studio.domain.MemberDetails;
import com.jisan.studio.domain.MemberVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberDetailsServiceImpl implements MemberDetailsService {

    @Autowired
    private MemberDao memberDao;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MemberVO> memberWrapper = memberDao.findById(username);
        MemberVO member = memberWrapper.orElse(null);

        return member == null ? new MemberDetails(member) : null;
    }

    @Override
    public String addUser(MemberVO member) {
        String password = member.getPassword();
        String encodePassword = passwordEncoder.encode(password);

        member.setPassword(encodePassword);

        return memberDao.save(member).getMemberId();
    }

}
