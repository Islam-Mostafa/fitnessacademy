package com.sport.academy.dto;

import com.sport.academy.base.dto.BaseDTO;

import com.sport.academy.entity.BranchEntity;
import com.sport.academy.entity.CoachEntity;
import com.sport.academy.entity.PlayerEntity;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO extends BaseDTO<Long>{
	private String gameName;
	private String gameDescription;
//	private Set<BranchDTO> gameBranches;
//	private Set<CoachDTO> gameCoaches;
//	private Set<PlayerDTO> gamePlayers;
}
