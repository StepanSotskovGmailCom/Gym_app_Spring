package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}
