package board.security;

import java.util.ArrayList;


import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import board.board.entity.MemberEntity;
import board.board.entity.MemberRoleEntity;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@SuppressWarnings("serial") 
public class BoardSecurityUser extends User {
	
	private static final String ROLE_PREFIX = "ROLE_";

	private MemberEntity member;

	public BoardSecurityUser(MemberEntity member) {
		super(member.getUid(), member.getBcrypt(), makeGrantedAuthority(member.getRoles()));
	    log.info("MEMBER: " + member);
	    log.info("UserID :" + member.getUid() + "\n");
		log.info("Bcrypt :" + member.getBcrypt() + "\n");
		log.info("Role :" + member.getRoles() + "\n");		
		log.info(getPassword());
		log.info(getUsername());
		this.member = member;
	}

	private static List<GrantedAuthority> makeGrantedAuthority(List<MemberRoleEntity> roles) {

		List<GrantedAuthority> list = new ArrayList<>();
		roles.forEach(role -> list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role.getRoleName())));
		return list;
	}
}
