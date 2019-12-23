package com.wbf.test.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
    private static final String[] IGNORE_URL = {"/login.jsp", "/user/login"};
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        String url = request.getRequestURL().toString();
        //不拦截上面定义的路径
        for (String str : IGNORE_URL) {
            if (url.contains(str)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
        	HttpSession session = request.getSession(false);
            if (session != null && session.getAttribute("role")!=null) {
            	return true;
            }else{
            	 request.getSession().invalidate();
            	 response.sendRedirect(request.getContextPath()+"/login.jsp"); 
            	 return false;
            }
        }
        return true;
    }
    
    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}