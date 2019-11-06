/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.rest.pcg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author kangxu [xukang@engine3d.com]
 * @version v1.0
 * @className HelloWorldApi
 * @description
 * @date 2019/11/6 13:32
 */
@RestController
public class HelloWorldApi {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("sayHello")
    public String sayHello() {
        return restTemplate.getForEntity("http://header-api/api/sayHello?testParam=111", String.class).getBody();
    }


}
