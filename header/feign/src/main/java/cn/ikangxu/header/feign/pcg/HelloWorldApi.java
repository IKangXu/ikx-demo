/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.feign.pcg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @className HelloWorldApi
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 14:33
 * @version v1.0
 */
@RestController
public class HelloWorldApi {

    @Autowired
    private IHelloWorldService helloWorldService;

    @GetMapping("sayHello")
    public String sayHello(@RequestParam("testParam") String testParam) {
        // 先获取testHeader
        String testHeader = "";
        return helloWorldService.sayHello(testParam);
    }

}
