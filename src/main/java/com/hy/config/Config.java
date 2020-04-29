package com.hy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hy.interceptor.HyInterceptor;

/**  
* Config
* Creater by chenhaiyang on 2019年3月6日
*/
@Configuration
@MapperScan("com.hy.mapper")
public class Config implements WebMvcConfigurer{

	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        //登录拦截的管理器
        InterceptorRegistration registration = registry.addInterceptor(new HyInterceptor());     //拦截的对象会进入这个类中进行判断
        registration.addPathPatterns("/**");                    //所有路径都被拦截
        registration.excludePathPatterns("/","/login","/error","/static/**","/logout");       //添加不拦截路径
    }
	
}
