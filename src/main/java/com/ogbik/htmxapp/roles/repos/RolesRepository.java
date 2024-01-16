package com.ogbik.htmxapp.roles.repos;

import com.ogbik.htmxapp.roles.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
