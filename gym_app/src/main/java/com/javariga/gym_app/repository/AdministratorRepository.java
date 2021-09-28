package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    Administrator findByAdministratorName(String name);
}
