package com.jisan.studio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "authority")
public class AuthVO {

    @Id
    @Column(name = "authority")
    private String authority;

    @Column(name = "member_id")
    private String memberId;

}
