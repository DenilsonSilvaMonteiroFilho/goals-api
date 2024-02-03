package com.goals.backend.repositories;

import com.goals.backend.entities.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepository extends JpaRepository<Meta, Integer> {
}
