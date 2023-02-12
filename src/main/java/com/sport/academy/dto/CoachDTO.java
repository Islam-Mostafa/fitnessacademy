package com.sport.academy.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CoachDTO {

	private int coachId;
	private String firstName;

	private String lastName;

	private String address;

	private Date birthDate;

	private int groupId;

	private int branchId;

	private boolean coachStatus;

	private String phone;

}