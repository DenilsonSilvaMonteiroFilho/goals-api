package com.goals.backend.repositories;

import com.goals.backend.entities.Habito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitoRepository extends JpaRepository<Habito, Integer> {
}
