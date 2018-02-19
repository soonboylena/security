package com.github.soonboylena.security.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("test")
    public Map<String, String> test() {
        return Collections.singletonMap("test", "test");
    }
}
