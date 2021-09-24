package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.AdministratorRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRoleRepository extends JpaRepository<AdministratorRole, Long> {
}
