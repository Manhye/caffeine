package com.example.caffeine.repository;

import com.example.caffeine.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaffeineRepository extends JpaRepository<Data, Long> {
}