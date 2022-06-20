package com.xans;

import com.xans.util.RabbitMQUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

//@MapperScan({"com.xans.common.mapper"})
@EnableOpenApi
@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        RabbitMQUtil.checkServer();
        SpringApplication.run(Application.class, args);
    }

}
