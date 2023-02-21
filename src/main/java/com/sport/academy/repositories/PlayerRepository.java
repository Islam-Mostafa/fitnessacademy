package com.sport.academy.repositories;

import org.springframework.stereotype.Repository;

import com.sport.academy.base.repository.BaseRepository;
import com.sport.academy.entity.PlayerEntity;
@Repository
public interface PlayerRepository extends BaseRepository<PlayerEntity, Long> {

}
