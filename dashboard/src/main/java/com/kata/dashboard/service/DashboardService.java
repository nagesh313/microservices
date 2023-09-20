package com.kata.dashboard.service;

import com.kata.dashboard.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {
    @Autowired
    DashboardRepository dashboardRepository;

    public Long getPostCount() {
        return dashboardRepository.findFirstByOrderByIdDesc().getPostCount();
    }


    public Long getCommentCount() {
        return dashboardRepository.findFirstByOrderByIdDesc().getCommentCount();
    }
}
