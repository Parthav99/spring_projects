package com.parthcodes.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}") // using variable from application.properties
    private String appName;

    @RequestMapping("/")
    public String index() {
        System.out.println(appName);
        return "index.html";
    }
}
