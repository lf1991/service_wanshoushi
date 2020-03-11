package com.lanzhou.wanshou.filter;


import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 跨域解决方案
 *
 * @author lifei
 */
public class AllowOriginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String origin = request.getHeader("Origin");
        if (StringUtils.isEmpty(origin)) {
            //设置响应头，允许跨域访问
            response.addHeader("Access-Control-Allow-Origin", origin);
        }
        /**
         * GET,POST,OPTIONS，PUT,DELETE 表示允许跨域请求的方法
         */
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, DELETE");

        /**
         * 表示在86400秒内不需要再发送预校验请求
         */
        response.addHeader("Access-Control-Max-Age", "86400");

        //支持所有自定义头
        String headers = request.getHeader("Access-Control-Request-Headers");
        if (StringUtils.isEmpty(headers)) {
            //允许JSON请求，并进行预检命令缓存
            response.addHeader("Access-Control-Allow-Headers", headers);
        }

        response.addHeader("Access-Control-Max-Age", "3600");
        //允许cookie
        response.addHeader("Access-Control-Allow-Credentials", "true");
        filterChain.doFilter(servletRequest, response);
    }

    @Override
    public void destroy() {

    }
}
