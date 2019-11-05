/*
 *  Engine3D Technologies Co., Ltd. Copyright 2019,  All rights reserved
 */

package cn.ikangxu.header.feign.pcg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @className IHelloWorldService
 * @description 
 * @author kangxu [xukang@engine3d.com]
 * @date 2019/11/5 14:34
 * @version v1.0
 */
@FeignClient(value = "header-api")
public interface IHelloWorldService {

    @GetMapping("api/sayHello")
    String sayHello(@RequestParam("testParam") String testParam);

}
