package com.github.soonboylena.security.demo;

import com.github.soonboylena.security.browser.BrowserApplication;
import com.github.soonboylena.security.core.SecurityCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {BrowserApplication.class, SecurityCoreApplication.class})
public class SecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}
}
