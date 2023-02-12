package com.sport.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sport.academy.dto.PlayerDTO;
import com.sport.academy.mapper.PlayerMapper;
import com.sport.academy.model.PlayerEntity;
import com.sport.academy.repositories.playerRepository;

@Service
public class playerService {
	@Autowired
	playerRepository playerrepository;
	@Autowired
	PlayerMapper playerMapper;

	public List<PlayerEntity> getAllPlayers() {
		return playerrepository.findAll();
	}

	public PlayerDTO getPlayerById(long playerId) {
		return playerMapper.mapPlayerEnitityToPlayerDTO( playerrepository.findById(playerId).get());
	}

	public PlayerDTO addPlayer(PlayerDTO player) {

		return playerMapper.mapPlayerEnitityToPlayerDTO( playerrepository.save(playerMapper.mapPlayerDTOToPlayerEntity(player)));
	}

	public PlayerDTO updatePlayer(PlayerDTO player) {
		
		return playerMapper.mapPlayerEnitityToPlayerDTO( playerrepository.save(playerMapper.mapPlayerDTOToPlayerEntity(player)));
	}
	public void deletePlayer(long playerId) {

		playerrepository.deleteById(playerId);
	}
}
