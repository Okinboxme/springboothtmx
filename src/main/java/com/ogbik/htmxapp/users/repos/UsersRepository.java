package com.ogbik.htmxapp.users.repos;

import com.ogbik.htmxapp.users.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Long> {
}
