package com.simplilearn.cricket.repository;

import com.simplilearn.cricket.entity.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketerRepository extends JpaRepository<Cricketer,Integer> {
}
