package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
