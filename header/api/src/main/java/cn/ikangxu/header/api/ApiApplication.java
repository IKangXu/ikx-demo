/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @className ApiApplication
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 13:41
 * @version v1.0
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
@SpringCloudApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
