package net.htwater.xiaodiclass.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import net.htwater.xiaodiclass.utils.JsonData;
import net.htwater.xiaodiclass.utils.JwtUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginInterceptor implements HandlerInterceptor {

    //进入到controller的方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            String token = request.getHeader("token");
            if (token == null) {
                token = request.getParameter("token");
            }

            if (StringUtils.isNotBlank(token)) {
                Claims claims = JwtUtil.checkJwt(token);
                if (claims == null) {
                    //告诉登录过期
                    sendJsonMessage(response, JsonData.buildError("登录过期,重新登录"));
                    return false;
                }
                String id = (String) claims.get("id");
                String name = (String) claims.get("name");

                request.setAttribute("userId",id);
                request.setAttribute("name",name);

                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //告诉登录过期
        sendJsonMessage(response, JsonData.buildError("登录过期,重新登录"));

        return false;
    }

    //相应json给前端
    public static void sendJsonMessage(HttpServletResponse response,Object object){

        try {
            response.setContentType("application/json; charset=utf-8");
            PrintWriter printWriter=response.getWriter();
            printWriter.print(new ObjectMapper().writeValueAsString(object));

            printWriter.close();
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
