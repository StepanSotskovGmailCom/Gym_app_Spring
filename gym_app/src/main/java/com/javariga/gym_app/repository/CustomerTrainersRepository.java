package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.CustomerTrainers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerTrainersRepository extends JpaRepository<CustomerTrainers, Long> {
}
