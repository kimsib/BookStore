package com.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.shop.constant.Role;
import com.shop.dto.MemberFormDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "member")
@Getter
@Setter
@ToString
public class Member extends BaseEntity {

	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	public String name;

	@Column(unique = true)
	public String email;

	public String password;

	@Enumerated(EnumType.STRING)
	public Role role;

	public String address;

	public static Member createMember(MemberFormDto memberFormDto, PasswordEncoder passwordEncoder) {
		Member member = new Member();
		member.setName(memberFormDto.getName());
		member.setEmail(memberFormDto.getEmail());
		member.setAddress(memberFormDto.getAddress());
		String password = passwordEncoder.encode(memberFormDto.getPassword());
		member.setPassword(password);
		member.setRole(Role.ADMIN);
		return member;
	}

}
