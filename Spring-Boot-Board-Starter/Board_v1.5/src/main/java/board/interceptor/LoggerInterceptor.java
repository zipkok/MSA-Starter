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
		log.info("========================== START =================================");
		log.info(" Request URI \t\t\t:\t" + request.getRequestURI());
		log.info(" Request Method \t\t\t:\t" + request.getMethod());
		log.info(" Request ParameterNames \t\t:\t" + request.getParameterNames());
		log.info(" Request getQueryString \t\t:\t" + request.getQueryString());
		log.info(" Request getScheme \t\t\t:\t" + request.getScheme());
		log.info(" Request getHttpServletMapping \t:\t" + request.getHttpServletMapping());
		log.info(" Request getAttributeNames \t\t:\t" + request.getAttributeNames());
		log.info(" Request getServletContext \t\t:\t" + request.getServletContext());
		log.info(" Request getUserPrincipal \t\t:\t" + request.getUserPrincipal());
		log.info(" Request getAuthType \t\t:\t" + request.getAuthType());
		log.info(" Request getPathInfo \t\t:\t" + request.getPathInfo());
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		log.debug("===================== Send To a View =============================");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) throws Exception {
		log.debug("=============== Done after Operation of the View =================\n\n\n");
	}
}
