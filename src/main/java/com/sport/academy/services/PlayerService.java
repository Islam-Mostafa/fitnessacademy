package com.sport.academy.services;

import com.sport.academy.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import com.sport.academy.base.service.BaseService;
import com.sport.academy.entity.PlayerEntity;

@Service
public class PlayerService extends BaseService<PlayerEntity, Long, PlayerRepository>{

}
