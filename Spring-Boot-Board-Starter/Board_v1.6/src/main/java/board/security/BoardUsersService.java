package board.security;

//import org.jline.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import board.board.repository.MemberRepository;

@Service
public class BoardUsersService implements UserDetailsService {
	@Autowired
	MemberRepository member;
		
	@Override
	public UserDetails loadUserByUsername(String Uid) throws UsernameNotFoundException {
		//logger.info("BoardUsersService Starting ..... ");
		return  
				member.findById(Uid)
					.filter(m -> m != null)
					.map(m -> new BoardSecurityUser(m)).get();
	}
}
