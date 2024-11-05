package com.portfolio.myselectshop.repository;

import com.portfolio.myselectshop.entity.ApiUseTime;
import com.portfolio.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User loginUser);
}
