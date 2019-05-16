package board.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.tags.Param;

import board.board.entity.MemberEntity;
import board.board.repository.MemberRepository;
import board.board.service.CommonService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {
	@Autowired
	CommonService CommonService;
	
	@Autowired
	PasswordEncoder pwEncoder;
	
	@Autowired
	MemberRepository repo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String RootPage() throws Exception {
		return "/noauth";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String GetLogin() throws Exception {
		return "/common/CommonLogin"; 
	}
		
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String GetRegister(MemberEntity member) throws Exception {
		//return "/member/join";
		return "/common/CommonRegister";
	}
	
	@PostMapping("/join")
	public String PostRegister(@ModelAttribute("member") MemberEntity member) {
	    log.info("MEMBER: " + member);
	    log.info("UserID :" + member.getUid() + "\n");
		//log.info("Username :" + member.getUname() + "\n");
		log.info("Bcrypt :" + member.getBcrypt() + "\n");
		//log.info("Upw :" + member.getUpw() + "\n");
		log.info("Role :" + member.getRoles() + "\n");		
		
		String encryptPw = pwEncoder.encode(member.getBcrypt());
		member.setBcrypt(encryptPw);
		log.info("Password :" + member.getBcrypt() + "\n");

	    repo.save(member);
	    //return "/member/joinResult";
	    return "/common/CommonLogin";
	    }
	
	//@RequestMapping(value="/join", method=RequestMethod.GET)
	//public String GetRegister(MemberEntity member) throws Exception {
	//	return "/common/CommonRegister";
	//}
	
	//@RequestMapping(value="/join", method=RequestMethod.POST)
	//public String PostRegister(MemberEntity member) throws Exception {
	//	CommonService.saveMember(member);
	//	return "redirect:/login";
	//}

	@RequestMapping("/guest")
	public String forGuest() {
		return "guest/CommonGuest";
	}
	
	@GetMapping("/accessDenied")
	public void accessDenied() {
	}
}
