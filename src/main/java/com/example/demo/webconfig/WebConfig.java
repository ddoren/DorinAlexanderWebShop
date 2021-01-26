package com.example.demo.webconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://ec2-52-200-205-227.compute-1.amazonaws.com:8081/search/",
                        "http://ec2-18-234-137-222.compute-1.amazonaws.com:3000")
                //.allowedMethods("PUT", "DELETE")
                //.allowedHeaders("header1", "header2", "header3")
                //.exposedHeaders("header1", "header2")
                .allowCredentials(true)
                .allowedMethods("PUT","DELETE","GET","POST")
                .maxAge(3600);
    }
}