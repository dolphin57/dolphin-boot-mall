package io.dolphin.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020/8/19 12:54
 */
@MapperScan("io.dolphin.portal.mapper")
@SpringBootApplication(scanBasePackages = "io.dolphin.portal")
public class DolphinBootPortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(DolphinBootPortalApplication.class, args);
    }
}
