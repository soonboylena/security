package com.github.soonboylena.security.core;

import com.github.soonboylena.security.core.properties.SecurityProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SecurityProperty.class)
public class SecurityCoreApplication {

}
