package com.github.soonboylena.security.browser.controller;

import com.github.soonboylena.security.core.properties.SecurityProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class BrowserSecurityController {

//    private RequestCache requestCache = new HttpSessionRequestCache();

//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Autowired
    private SecurityProperty securityProperty;

    @RequestMapping("authentication/require")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public void requireAuth(HttpServletRequest request, HttpServletResponse response) throws IOException {

        if (isAjax(request)) {
            new DefaultRedirectStrategy().sendRedirect(request, response, securityProperty.getBrowserProperty().getLoginPage());
        }
    }


    private boolean isAjax(HttpServletRequest request) {
        String requestedWithHeader = request.getHeader("X-Requested-With");
        return "XMLHttpRequest".equals(requestedWithHeader);
    }

}
