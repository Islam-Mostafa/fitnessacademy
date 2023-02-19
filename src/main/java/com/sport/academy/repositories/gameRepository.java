package com.sport.academy.repositories;

import org.springframework.stereotype.Repository;

import com.sport.academy.base.repository.BaseRepository;
import com.sport.academy.entity.GameEntity;

@Repository
public interface gameRepository extends BaseRepository<GameEntity, Integer> {

}
