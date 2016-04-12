package cn.com.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zl on 2015/8/27.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .genericModelSubstitutes(DeferredResult.class)
//                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base�����յ��ýӿں���pathsƴ����һ��
                .select()
                .paths(or(regex("/api/.*")))//���˵Ľӿ�
                .build()
                .apiInfo(testApiInfo());
    }


    public ApiInfo testApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Electronic Health Record(EHR) Platform API",//�����
                "EHR Platform's REST API, for system administrator",//С����
                "1.0",//�汾
                "NO terms of service",
                "bingwenwuhen@163.com",//����
                "The Apache License, Version 2.0",//������ʾ����
                "http://www.apache.org/licenses/LICENSE-2.0.html"//��վ����
        );
        return apiInfo;
    }
}