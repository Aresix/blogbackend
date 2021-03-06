package com.aresix.blogbackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/file/covers/**").addResourceLocations("file:F:/ECNU/DBMS/project/blogbackend/src/main/resources/img/covers/");
        registry.addResourceHandler("/api/file/avatars/**").addResourceLocations("file:F:/ECNU/DBMS/project/blogbackend/src/main/resources/img/avatars/");
        super.addResourceHandlers(registry);
    }
}
