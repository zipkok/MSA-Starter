package board.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerInterceptor extends HandlerInterceptorAdapter{
	//Logger log = LoggerFactory.getLogger("LoggerInterceptor");
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.debug("========================== START =================================");
		log.debug(" Request URI \t:\t" + request.getRequestURI());
		log.debug(" Request Method \t:\t" + request.getMethod() + "\n");
		log.debug(" Request ParameterNames \t:\t" + request.getParameterNames()+ "\n");
		log.debug(" Request ParameterNames \t:\t" + request.getQueryString()+ "\n");
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		log.debug("===================== Send To a View =============================\n\n\n");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) throws Exception {
		log.debug("=============== Done after Operation of the View =================\n\n\n");
	}
}
