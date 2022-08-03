package com.keyword.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImagePathConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/image/icon/**").addResourceLocations("file:/Users/ung/Documents/Work/Tools/workspace-spring-tool-suite-4-4.15.1.RELEASE/KeywordAPI/src/main/webapp/static/upload/icon/");
		registry.addResourceHandler("/image/screenshot/**").addResourceLocations("file:/Users/ung/Documents/Work/Tools/workspace-spring-tool-suite-4-4.15.1.RELEASE/KeywordAPI/src/main/webapp/static/upload/screenshot/");

	}
}
