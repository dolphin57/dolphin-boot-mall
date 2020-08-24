package io.dolphin.portal.infra.config;

import io.dolphin.mall.common.domain.SwaggerProperties;
import io.dolphin.mall.common.infra.config.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("io.dolphin.portal.api.controller")
                .title("mall前台系统")
                .description("mall前台相关接口文档")
                .contactName("eric")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
