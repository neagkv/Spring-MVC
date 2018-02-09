package com.advancedMVC.application.repository;

import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */
@Repository("RoleRepo")
public interface RoleRepository extends JpaRepository<Role, Integer>  {
        Role findByRole(String role);
}
