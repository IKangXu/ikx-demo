/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.api.pcg;

import org.springframework.web.bind.annotation.*;

/**
 *
 * @className HelloWorldApi
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 13:34
 * @version v1.0
 */
@RestController
public class HelloWorldApi {

    @GetMapping("sayHello")
    public String sayHello(@RequestHeader(value = "testHeader", required = false) String testHeader, @RequestParam("testParam") String testParam) {
        return new StringBuilder("testHeader=").append(testHeader)
                .append(";testParam=").append(testParam)
                .toString();
    }
}
