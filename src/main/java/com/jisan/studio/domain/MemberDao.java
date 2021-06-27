package com.jisan.studio.domain;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<MemberVO, String> {

    public Optional<MemberVO> findById(String id);
}
