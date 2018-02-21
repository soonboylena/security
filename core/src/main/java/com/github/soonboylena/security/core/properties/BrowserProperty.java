package com.github.soonboylena.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "browser")
public class BrowserProperty {
    private String loginPage = "/aoo";
}
