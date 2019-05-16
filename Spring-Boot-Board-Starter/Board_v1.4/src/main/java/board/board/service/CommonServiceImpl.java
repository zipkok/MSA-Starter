package board.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import board.board.entity.MemberEntity;
import board.board.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CommonServiceImpl implements CommonService {
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	PasswordEncoder pwEncoder;
	
	@Override
	public List<MemberEntity> selectMemberList() throws Exception {
		return memberRepository.findAllByOrderByUidDesc();
	}	
	
	@Override
	public void saveMember(MemberEntity member) throws Exception {
		log.info("CommonService is saved in memberRepository");
	    log.info("MEMBER: " + member);
	    log.info("UserID :" + member.getUid() + "\n");
		log.info("Bcrypt :" + member.getBcrypt() + "\n");
		log.info("Role :" + member.getRoles() + "\n");	
		String encryptPw = pwEncoder.encode(member.getBcrypt());
		member.setBcrypt(encryptPw);
		memberRepository.save(member);
	}
}
