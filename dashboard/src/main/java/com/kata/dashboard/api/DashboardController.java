package com.kata.dashboard.api;

import com.kata.dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/count/posts")
    public ResponseEntity<Long> getPostCount() {
        Long postCount = dashboardService.getPostCount();
        return new ResponseEntity<>(postCount, HttpStatus.OK);
    }

    @GetMapping("/count/comments")
    public ResponseEntity<Long> getCommentCount() {
        Long commentCount = dashboardService.getCommentCount();
        return new ResponseEntity<>(commentCount, HttpStatus.OK);
    }


}