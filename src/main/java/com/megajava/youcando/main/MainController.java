package com.megajava.youcando.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = {"/", "/main"})
    public String mainPage() {
        return "/main";
    }

    @GetMapping("/question")
    public String questionStart() {
        return "redirect:/question/1";
    }
}

