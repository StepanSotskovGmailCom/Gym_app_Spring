package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.CustomerMembership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerMembershipRepository extends JpaRepository<CustomerMembership, Long> {
}
