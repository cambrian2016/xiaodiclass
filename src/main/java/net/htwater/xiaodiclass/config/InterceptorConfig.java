package net.htwater.xiaodiclass.config;

import net.htwater.xiaodiclass.interceptor.CorsInterceptor;
import net.htwater.xiaodiclass.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 类  名：InterceptorConfig
 * 描  述：拦截器配置
 * <p>
 * 功能一：不用权限就可以访问url  /api/v1/pub/
 * 登录才可以访问url /api/v1/pri/
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Bean
    CorsInterceptor corsInterceptor() {
        return new CorsInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //?   匹配任何单字符
        //*   匹配0或者任意数量的字符
        //**  匹配0或者更多的目录
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/api/v1/pri/**")
                .excludePathPatterns("/api/v1/pri/user/login", "/api/v1/pri/user/register");

        registry.addInterceptor(corsInterceptor()).addPathPatterns("/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
