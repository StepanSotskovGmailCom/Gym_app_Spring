package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.TrainerRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRoleRepository extends JpaRepository<TrainerRole, Long> {
}
