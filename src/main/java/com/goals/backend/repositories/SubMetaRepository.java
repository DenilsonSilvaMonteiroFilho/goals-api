package com.goals.backend.repositories;

import com.goals.backend.entities.SubMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubMetaRepository extends JpaRepository<SubMeta, Integer> {
}
