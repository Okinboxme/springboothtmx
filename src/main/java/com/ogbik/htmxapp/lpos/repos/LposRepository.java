package com.ogbik.htmxapp.lpos.repos;

import com.ogbik.htmxapp.lpos.domain.Lpos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LposRepository extends JpaRepository<Lpos, Integer> {
}
