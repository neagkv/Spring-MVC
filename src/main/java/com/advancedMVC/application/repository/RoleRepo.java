package com.advancedMVC.application.repository;

import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */

public interface RoleRepo {
    @Repository("roleRepository")
    public interface RoleRepository extends JpaRepository<Role, Integer> {
        Role findByRole(String role);

    }
}
