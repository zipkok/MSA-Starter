package board.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource dataSource;
	
	@Autowired
	BoardUsersService boardUsersService;
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		log.info("============================ START ===============================");
    	log.info(" /resource/** is Filtering ..... ");
		web.ignoring().antMatchers("/resources/**");
		web.ignoring().antMatchers("/images/**");
		web.ignoring().antMatchers("/actuator/**");		
		log.info("============================= END ================================\n");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
    	log.info("============================ START ===============================");
    	log.info(" Spring Security Authorization is Starting ..... ");
		http.authorizeRequests().antMatchers("/guest/**").hasRole("GUEST");
		http.authorizeRequests().antMatchers("/board/**").hasRole("MANAGER");
		http.formLogin().loginPage("/login").defaultSuccessUrl("/board").permitAll();
		http.csrf().disable();
		//http.formLogin().loginPage("/login");
		//http.exceptionHandling().accessDeniedPage("/accessDenied");
		//http.logout().logoutUrl("/logout").invalidateHttpSession(true);
		log.info("============================= END ================================\n");
	}

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
    	log.info("============================ START ===============================");
    	log.info(" BCryptPasswordEncoder Bean ..... ");
		log.info("============================= END ================================\n");
    	return new BCryptPasswordEncoder();
    }
	
	public void configure(AuthenticationManagerBuilder auth, UserDetailsService boardUserDetailService) throws Exception {
    	log.info("============================ START ===============================");
		log.info(" BuildAuth ..... ");
		auth.userDetailsService(boardUsersService).passwordEncoder(passwordEncoder());
		log.info("============================= END ================================\n");
	}
	
	
}
