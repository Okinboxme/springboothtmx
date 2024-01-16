package com.ogbik.htmxapp.clients.repos;

import com.ogbik.htmxapp.clients.domain.Clients;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientsRepository extends JpaRepository<Clients, Integer> {
}
