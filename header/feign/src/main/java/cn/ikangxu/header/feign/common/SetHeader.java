/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.feign.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @className SetHeader
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 14:38
 * @version v1.0
 */
@Component
public class SetHeader extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        response.setHeader("testHeader", "ikangxu-header");

        return true;
    }
}
