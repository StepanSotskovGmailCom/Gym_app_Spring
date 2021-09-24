package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.CustomerPerk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPerkRepository extends JpaRepository<CustomerPerk, Long> {
}
