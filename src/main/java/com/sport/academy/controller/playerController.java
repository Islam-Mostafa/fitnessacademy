package com.sport.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sport.academy.dto.PlayerDTO;
import com.sport.academy.model.PlayerEntity;
import com.sport.academy.services.playerService;

@RestController
@RequestMapping("/api/v1")
public class playerController {
	@Autowired
	playerService playerservice;

	@GetMapping("/players")
	public List<PlayerEntity> getplayers() {
		return playerservice.getAllPlayers();
	}

	@GetMapping("/player")
	public PlayerDTO getplayerById(@RequestParam long playerId) {
		return playerservice.getPlayerById(playerId);
	}

	@PostMapping("/player")
	public long addPlayer(@RequestBody PlayerDTO player) {
		return playerservice.addPlayer(player).getPlayerId();
	}

	@PutMapping("/player")
	public long updatePlayer(@RequestBody PlayerDTO player) {
		return playerservice.updatePlayer(player).getPlayerId();
	}

	@DeleteMapping("/player")
	public void deletePlayerById(@RequestParam long playerId) {
		playerservice.deletePlayer(playerId);

	}
}
