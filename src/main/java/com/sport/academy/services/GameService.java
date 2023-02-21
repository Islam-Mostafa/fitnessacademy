package com.sport.academy.services;

import com.sport.academy.repositories.GameRepository;
import org.springframework.stereotype.Service;

import com.sport.academy.base.service.BaseService;
import com.sport.academy.entity.GameEntity;

@Service
public class GameService extends BaseService<GameEntity, Long, GameRepository> {

}
