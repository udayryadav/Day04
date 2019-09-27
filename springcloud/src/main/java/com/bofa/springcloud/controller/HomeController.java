package com.bofa.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${msg}")
	private String message;

	@GetMapping("/showConfig")
	public String showConfig() {
		String configInfo = "<br/>spring.datasource.driver-classname=" + driver + "br/>spring.datasource.url=" + url
				+ "br/>spring.datasource.username=" + username + "br/>spring.datasource.msg=" + message;
		return configInfo;
	}
}
