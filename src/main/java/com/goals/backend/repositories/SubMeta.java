package com.goals.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubMeta extends JpaRepository<SubMeta, Integer> {
}
