/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.feign;

import cn.ikangxu.boot.header.annotation.EnableHeader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @className FeignApplication
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 14:31
 * @version v1.0
 */
@EnableHeader({"testHeader"})
@EnableAutoConfiguration
@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients
@SpringCloudApplication
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
