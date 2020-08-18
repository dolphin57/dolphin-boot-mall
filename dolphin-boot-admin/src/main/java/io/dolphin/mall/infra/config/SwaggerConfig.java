package io.dolphin.mall.infra.config;

import io.dolphin.mall.common.domain.SwaggerProperties;
import io.dolphin.mall.common.infra.config.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: Swagger API文档相关配置
 * @Author: Eric Liang
 * @Since: 2020/8/14 11:16
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("dolphin")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
