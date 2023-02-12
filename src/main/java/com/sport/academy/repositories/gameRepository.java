package com.sport.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.academy.model.GameEntity;

@Repository
public interface gameRepository extends JpaRepository<GameEntity, Integer> {

}
