package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
