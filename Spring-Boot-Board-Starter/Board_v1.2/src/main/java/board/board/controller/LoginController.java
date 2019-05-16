package board.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.board.entity.MemberEntity;
import board.board.service.CommonService;

@Controller
public class LoginController {
	@Autowired
	private CommonService CommonService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String GetLogin() throws Exception {
		return "/common/CommonLogin"; 
	}
		
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String GetRegister(MemberEntity member) throws Exception {
		return "/common/CommonRegister";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String PostRegister(MemberEntity member) throws Exception {
		CommonService.saveMember(member);
		return "redirect:/login";
	}
	
}
