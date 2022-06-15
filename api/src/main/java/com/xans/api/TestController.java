package com.xans.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试接口")
@RequestMapping("/test")
public class TestController {


    @ApiOperation(value = "测试get")
    @GetMapping("/getStr")
    public String get() {
        return "Hi";
    }
}
