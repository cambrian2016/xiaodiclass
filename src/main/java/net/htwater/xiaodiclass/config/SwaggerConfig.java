package net.htwater.xiaodiclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docker() {

        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        ticketPar.name("token").description("登录返回token")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors 配置要扫描接口的方式
                .apis(RequestHandlerSelectors.any())
                //过滤路径
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .enable(true);
    }


    //作者信息
    private Contact contact = new Contact("沈晓耘", "", "969553988@qq.com");

    //Swagger 头部信息
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "小滴课堂Api文档",
                "Spring Boot 学习项目 -by沈晓耘",
                "1.01",
                "",
                contact,
                "",
                "",
                new ArrayList()
        );
        return apiInfo;
    }
}
