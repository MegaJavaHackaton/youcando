package com.megajava.youcando.question;

import com.megajava.youcando.user.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class QuestionController {
    private final UserDTO user;
    private final QuestionService questionService;

    @GetMapping("/question")
    public String firstQ() {
        return "redirect:/questionPage"; // 첫 번째 질문을 보여주는 페이지로 리다이렉트
    }

    @PostMapping("/question/result")
    public ResponseEntity<String> resultMBTI (@RequestBody Map<String, String> selectedValues) {
        for(Map.Entry<String, String> entry : selectedValues.entrySet()) {
            switch (entry.getKey()) {
                case "q1":
                    questionService.checkEI(entry.getValue());
                    break;
                case "q2":
                    questionService.checkNS(entry.getValue());
                    break;
                case "q3":
                    questionService.checkNS(entry.getValue());
                    break;
                case "q4":
                    questionService.checkPJ(entry.getValue());
                    break;
                case "q5":
                    questionService.checkPJ(entry.getValue());
                    break;
                case "q6":
                    questionService.checkEI(entry.getValue());
                    break;
                case "q7":
                    questionService.checkNS(entry.getValue());
                    break;
                case "q8":
                    questionService.checkEI(entry.getValue());
                    break;
                case "q9":
                    questionService.checkTF(entry.getValue());
                    break;
                case "q10":
                    questionService.checkTF(entry.getValue());
                    break;
                case "q11":
                    questionService.checkTF(entry.getValue());
                    break;
                case "q12":
                    questionService.checkPJ(entry.getValue());
                    break;
            }
        }

        questionService.resultMapping();

        return ResponseEntity.ok("redirect:/result");
    }

}
