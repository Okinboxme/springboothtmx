package com.ogbik.htmxapp.users_roles.repos;

import com.ogbik.htmxapp.users_roles.domain.UsersRoles;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRolesRepository extends JpaRepository<UsersRoles, Long> {
}
