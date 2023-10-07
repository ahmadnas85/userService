package com.UserService.UserService.pollFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "poll-service",
        url = "http://localhost:8000"
)
public interface PollFeignService {
    @DeleteMapping("/answers/deleteAnswer")
    void deleteAnsweredQuestionByUserId(@RequestParam Long id);
}
