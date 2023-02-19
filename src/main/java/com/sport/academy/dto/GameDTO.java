package com.sport.academy.dto;

import com.sport.academy.base.dto.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GameDTO extends BaseDTO<Long>{
//	private long gameId;
	private String gameName;
//	private boolean gameStatus;
	private int brancheId;
}
