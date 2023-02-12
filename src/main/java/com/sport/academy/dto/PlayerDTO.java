package com.sport.academy.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
	private long playerId;
	private String firstName;
	private String lastName;
	private String address;
	private Date birthDate;
	private int coachId;
	private int groupId;
	private int branchId;
	private int gameId;
	private boolean playerStatus;
	private String phone;

}