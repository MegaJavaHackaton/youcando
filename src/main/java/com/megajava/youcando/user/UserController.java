package com.megajava.youcando.user;

import com.megajava.youcando.group.Group;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/setGroupId")
    public ResponseEntity<String> setGroupId(@RequestParam Group finalResult) {
        userService.setGroupId(finalResult);
        return ResponseEntity.ok("GroupId set successfully.");
    }
}
