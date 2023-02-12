package com.sport.academy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GameDTO {
	private int gameId;
	private String gameName;
	private boolean gameStatus;
	private int brancheId;
}
