package com.sport.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sport.academy.base.service.BaseService;
import com.sport.academy.dto.PlayerDTO;
import com.sport.academy.entity.PlayerEntity;
import com.sport.academy.mapper.PlayerMapper;
import com.sport.academy.repositories.playerRepository;

@Service
public class PlayerService extends BaseService<PlayerEntity, Long>{
	@Autowired
	playerRepository playerrepository;
	@Autowired
	PlayerMapper playerMapper;

	public List<PlayerEntity> getAllPlayers() {
		return playerrepository.findAll();
	}

	public PlayerDTO getPlayerById(long playerId) {
		return playerMapper.mapEntityToDTO( playerrepository.findById(playerId).get());
	}

	public PlayerDTO addPlayer(PlayerDTO player) {

		return playerMapper.mapEntityToDTO( playerrepository.save(playerMapper.unMapDTOToEntity(player)));
	}

	public PlayerDTO updatePlayer(PlayerDTO player) {
		
		return playerMapper.mapEntityToDTO( playerrepository.save(playerMapper.unMapDTOToEntity(player)));
	}
	public void deletePlayer(long playerId) {

		playerrepository.deleteById(playerId);
	}
}
