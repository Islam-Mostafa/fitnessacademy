package com.sport.academy.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Games")
public class GameEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gameId;
	@Nonnull
	@Column(name = "GameName")
	private String gameName;
	@Nonnull
	@Column(name = "GameStatus")
	private boolean gameStatus;
	@Nonnull
	@Column(name = "BrancheId")
	private int brancheId;
}
