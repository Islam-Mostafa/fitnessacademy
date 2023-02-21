package com.sport.academy.controller;

import com.sport.academy.dto.PlayerDTO;
import com.sport.academy.mapper.PlayerMapper;
import com.sport.academy.services.PlayerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerservice;
    private final PlayerMapper playerMapper;

    @GetMapping("/players")
    public List<PlayerDTO> getPlayers() {
        return playerMapper.mapEntityToDTO(playerservice.findAll());
    }

    @GetMapping("/player")
    public PlayerDTO getPlayerById(@RequestParam long playerId) {
        return playerMapper.mapEntityToDTO(playerservice.findById(playerId));
    }

    @PostMapping("/player")
    public long addPlayer(@RequestBody PlayerDTO player) {
        return playerservice.insert(playerMapper.unMapDTOToEntity(player)).getId();
    }

    @PutMapping("/player")
    public long updatePlayer(@RequestBody PlayerDTO player) {
        return playerservice.update(playerMapper.unMapDTOToEntity(player)).getId();
    }

    @DeleteMapping("/player")
    public void deletePlayerById(@RequestParam long playerId) {
        playerservice.deleteById(playerId);

    }
}
