package board.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.tags.Param;

import board.board.entity.MemberEntity;
import board.board.repository.MemberRepository;
import board.board.service.CommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@Api(description="Swagger2 for the LoginController")
public class LoginController {
	@Autowired
	CommonService CommonService;
	
	@Autowired
	PasswordEncoder pwEncoder;
	
	@Autowired
	MemberRepository repo;
	
	@ApiOperation(value = "모든 권한의 Index 페이지")
	@GetMapping("/")
	//@RequestMapping(value="/", method=RequestMethod.GET)
	public String RootPage() throws Exception {
		return "/noauth";
	}
	
	@ApiOperation(value = "로그인")
	@GetMapping("/login")
	//@RequestMapping(value="/login", method=RequestMethod.GET)
	public String GetLogin() throws Exception {
		return "/common/CommonLogin"; 
	}
	
	@ApiOperation(value = "회원가입")
	@GetMapping("/join")
	//@RequestMapping(value="/join", method=RequestMethod.GET)
	public String GetRegister(MemberEntity member) throws Exception {
		//return "/member/join";
		return "/common/CommonRegister";
	}
	
	@ApiOperation(value = "회원가입")
	@PostMapping("/join")
	public String PostRegister(@ModelAttribute("member") MemberEntity member) throws Exception{
	    log.info("MEMBER: " + member);
	    log.info("UserID :" + member.getUid() + "\n");
		log.info("Bcrypt :" + member.getBcrypt() + "\n");
		log.info("Role :" + member.getRoles() + "\n");		
		
		//String encryptPw = pwEncoder.encode(member.getBcrypt());
		//member.setBcrypt(encryptPw);
		log.info("Password :" + member.getBcrypt() + "\n");

		CommonService.saveMember(member);
	    //return "/member/joinResult";
	    return "redirect:/login";
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
	
	@ApiOperation(value = "게스트 권한의 Index 페이지")
	@GetMapping("/guest")
	public String forGuest() {
		return "guest/CommonGuest";
	}
	
	@ApiOperation(value = "에러 출력 페이지")
	@GetMapping("/accessDenied")
	public void accessDenied() {
	}
}
