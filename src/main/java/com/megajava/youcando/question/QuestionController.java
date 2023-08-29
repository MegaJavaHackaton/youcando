package com.megajava.youcando.question;

import com.megajava.youcando.user.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private final UserDTO user;
    private final QuestionService questionService;

    @GetMapping("/page1")
    public String firstQ() {
        return "redirect:/page1"; // 첫 번째 질문을 보여주는 페이지로 리다이렉트
    }

    @GetMapping(value = {"/page1", "/page1/i"})
    public String firstR(@RequestParam("answer") String answer) {
        questionService.checkEI(answer);
        return "redirect:/page2";
    }

    @GetMapping(value = {"/page2/n", "page2/s"})
    public String secondQ(@RequestParam("answer") String answer) {
        questionService.checkNS(answer);
        return "redirect:/page3";
    }

    @GetMapping("/result")
    public String resultPage(@RequestParam("answer") String answer) {
        questionService.checkPJ(answer);
        questionService.resultMapping();
    }

}
