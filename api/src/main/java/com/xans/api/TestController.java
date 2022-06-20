package com.xans.api;

import com.xans.common.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试接口")
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BaseService baseService;
    @ApiOperation(value = "测试send")
    @GetMapping("/sendStr")
    public String send() {
        return baseService.sendStr();
    }

}
