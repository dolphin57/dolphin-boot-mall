package io.dolphin.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020/8/12 19:18
 */
@SpringBootApplication
@MapperScan("io.dolphin.mall.mapper")
public class DolphinBootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(DolphinBootAdminApplication.class, args);
    }
}
