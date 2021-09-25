package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.CType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CTypeRepository extends JpaRepository<CType, Long> {
}
