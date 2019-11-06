/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.feign.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kangxu [xukang@engine3d.com]
 * @version v1.0
 * @className SetHeader
 * @description
 * @date 2019/11/5 14:38
 */
@Component
@WebFilter(filterName = "setHeader",urlPatterns = "/*")
public class SetHeader implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        MutableHttpServletRequestWrapper wrapper = new MutableHttpServletRequestWrapper(request);
        wrapper.putHeader("testHeader", "ikangxu-header");

        filterChain.doFilter(wrapper, response);
    }

    @Override
    public void destroy() {

    }
}