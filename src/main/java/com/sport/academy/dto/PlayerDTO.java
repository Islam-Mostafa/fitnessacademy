package com.sport.academy.dto;

import java.util.Date;

import com.sport.academy.base.dto.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO extends BaseDTO<Long>{
//	private long playerId;
	private String firstName;
	private String lastName;
	private String address;
	private Date birthDate;
	private long coachId;
	private long groupId;
	private long branchId;
	private long gameId;
//	private boolean playerStatus;
	private String phone;

}