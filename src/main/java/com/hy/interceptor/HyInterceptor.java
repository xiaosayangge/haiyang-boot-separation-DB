package com.hy.interceptor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.google.gson.Gson;

/**  
* HyInterceptor
* Creater by chenhaiyang on 2019年3月6日
*/
@ControllerAdvice
public class HyInterceptor implements HandlerInterceptor,ResponseBodyAdvice{

	Logger log=LoggerFactory.getLogger(HyInterceptor.class);
	
	Gson gson=new Gson();
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String path=request.getServletContext().getContextPath();
		MDC.put("traceId", UUID.randomUUID().toString().replaceAll("-", ""));
		path=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
		request.setAttribute("path", path+"/");
		request.setAttribute("ws", "ws://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/");
		return true;
	}

	@Override
	public boolean supports(MethodParameter returnType, Class converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		 Object res = body;
	        if (SUPPORT_MEDIA_TYPE.contains(selectedContentType)) {
	            if (!(res instanceof com.hy.util.ResultBody)) {
	                res = com.hy.util.ResultBody.success(body);
	                ((com.hy.util.ResultBody) res).setUuid(MDC.get("traceId"));
	                if (body instanceof String) {
	                    res = gson.toJson(res);
	                }
	            }else{
	            	((com.hy.util.ResultBody) res).setUuid(MDC.get("traceId"));
	            }
	        }
	        if (returnType.getDeclaringClass() != null && returnType.getMethod() != null) {
	            log.info("请求:{}.{},返回:{}", returnType.getDeclaringClass().getSimpleName(), returnType.getMethod().getName(), res instanceof String ? res : gson.toJson(res));
	        }
	        return res;
	}
	
	 private static final Set<MediaType> SUPPORT_MEDIA_TYPE = new HashSet<>(Arrays.asList(
	            MediaType.APPLICATION_JSON_UTF8,
	            MediaType.APPLICATION_JSON));
	
}
