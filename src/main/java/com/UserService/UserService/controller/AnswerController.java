package com.UserService.UserService.controller;

import com.UserService.UserService.pollFeign.PollFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answers")

public class AnswerController {
    @Autowired
    private PollFeignService pollfeignService;
    @DeleteMapping("/deleteAnswer")
    public void deleteAnsweredQuestionByUserId(@RequestParam Long id){
        pollfeignService.deleteAnsweredQuestionByUserId(id);
    }

}
