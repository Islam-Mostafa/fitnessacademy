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

import com.sport.academy.dto.GameDTO;
import com.sport.academy.mapper.GameMapper;
import com.sport.academy.services.GameService;

@RestController
@RequestMapping("/api/v1")
public class GameController {
@Autowired
GameService gameService;
@Autowired
GameMapper gameMapper;

@GetMapping("/games")
public List<GameDTO> getAllGames() {
	return gameMapper.mapEntityToDTO( gameService.findAll());
}

@GetMapping("/game")
public GameDTO getGameById(@RequestParam long gameId) {
	return gameMapper.mapEntityToDTO( gameService.findById(gameId));
}

@PostMapping("/game")
public long addGame(@RequestBody GameDTO game) {
	return gameService.insert(gameMapper.unMapDTOToEntity(game)).getId();
}

@PutMapping("/game")
public long updateGame(@RequestBody GameDTO game) {
	return gameService.update(gameMapper.unMapDTOToEntity(game)).getId();
}

@DeleteMapping("/game")
public void deleteGameById(@RequestParam long gameId) {
	gameService.deleteById(gameId);

}
}
