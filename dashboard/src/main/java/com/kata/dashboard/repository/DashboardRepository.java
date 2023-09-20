package com.kata.dashboard.repository;

import com.kata.dashboard.entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, String> {
    Dashboard findFirstByOrderByIdDesc();
}
