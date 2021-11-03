package com.bezkoder.spring.jwt.mongodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
@Profile({"local","dev","ud_dev","qat","uat"})
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("IM Member API Service").version("1.0.154").build();
    }


    @Bean
    public Docket createRestApi() {
        /*return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.velocitylight.im.controller"))
                .paths(PathSelectors.any())
                .build();*/

        //如果打開header內驗證token需要使用下面這段
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("Authorization").description("Bearer token").modelRef(new ModelRef("string")).parameterType("header").required(false).build(); //bearer 10070e0c-5aa6-4b08-be27-f98d2f397ab5
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.bezkoder.spring.jwt.mongodb.controllers")).build()
                .useDefaultResponseMessages(false)
                //.genericModelSubstitutes(RespData.class)
                .globalOperationParameters(aParameters)
                .directModelSubstitute(Timestamp.class, Long.class);

    }

    @Bean
    public SecurityScheme apiKey() {
        return new ApiKey(HttpHeaders.AUTHORIZATION, "apiKey", "header");
    }
}
