package com.github.soonboylena.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "soonboylena.security")
@Data
public class SecurityProperty {

    private BrowserProperty browserProperty = new BrowserProperty();

}
