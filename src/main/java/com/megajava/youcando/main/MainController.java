package com.megajava.youcando.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = {"/", "/main"})
    public String mainPage() {
        return "/main";
    }
}

