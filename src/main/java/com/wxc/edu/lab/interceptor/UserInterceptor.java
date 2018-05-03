package com.wxc.edu.lab.interceptor;

import com.wxc.edu.lab.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInterceptor implements HandlerInterceptor {
    private static final String[] IGNORE_URI = {"/login", "/404.html"};

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*默认用户没有登录 */
        boolean flag = false;
        /*获得请求的ServletPath */
        String servletPath = request.getServletPath();
        /*判断请求是否需要拦截 */
        for(String s : IGNORE_URI) {
            if(servletPath.contains(s)) {
                flag = true;
                break;
            }
        }

        /*拦截请求 */
        if(!flag) {
            /*获取session中的用户 */
            User user = (User) request.getSession().getAttribute("user_session");

            if(user == null) {
                request.setAttribute("message","请先登录再访问网站!");
                request.getRequestDispatcher("login").forward(request, response);
                return flag;
            } else {
                switch (user.getRole()) {
                    case "admin":
                        return servletPath.contains("admin");


                }
            }

        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
