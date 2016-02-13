package com.cloud.genderguesser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan
@EnableAutoConfiguration
public class GenderGuesserApp {

	  public static void main(String[] args) {
		SpringApplication.run(GenderGuesserApp.class, args);

	}


	  @Bean
	  public Docket newsApi() {
	      return new Docket(DocumentationType.SWAGGER_2)
	              .groupName("metrotrackingInfo")
	              .apiInfo(apiInfo())
	              .select()
	              .build();
	  }
	   
	  private ApiInfo apiInfo() {
	      return new ApiInfoBuilder()
	              .title("Cincinnati Metro Tracking Info")
	              .description("Web App build using Cincinnati Metro Tracking API")
	              .termsOfServiceUrl("Have Fun !")
	              .build();
	  }
}
