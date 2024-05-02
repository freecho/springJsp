package com.freecho.springjsp.config;

import com.freecho.springjsp.SpringJspApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 支持war包部署
 */
public class ServletInitializerConfig extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringJspApplication.class);
    }
}
