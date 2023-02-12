package com.sport.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.academy.model.CoachEntity;
@Repository
public interface coachRepository extends JpaRepository<CoachEntity, Integer>{

}
