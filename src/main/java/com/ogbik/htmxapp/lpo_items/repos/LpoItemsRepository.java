package com.ogbik.htmxapp.lpo_items.repos;

import com.ogbik.htmxapp.lpo_items.domain.LpoItems;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LpoItemsRepository extends JpaRepository<LpoItems, Integer> {
}
