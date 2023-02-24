package com.sport.academy.dto;

import com.sport.academy.entity.CoachEntity;
import com.sport.academy.entity.GameEntity;
import java.util.Date;

import com.sport.academy.base.dto.BaseDTO;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO extends BaseDTO<Long>{
	private String firstName;
	private String lastName;
	private String address;
	private Date birthDate;
	private String phone;
	private Set<CoachDTO> playersCoach;
	private long groupId;
	private BranchDTO playerBranch;
	private Set<GameDTO> playersGames;
	private AcademyDTO academy;

}