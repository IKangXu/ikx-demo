/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.feign.config;

import cn.ikangxu.header.feign.common.SetHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @className HeaderConfig
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 15:10
 * @version v1.0
 */
@Configuration
public class HeaderConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private SetHeader setHeader;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(setHeader).addPathPatterns("/**");
    }
}