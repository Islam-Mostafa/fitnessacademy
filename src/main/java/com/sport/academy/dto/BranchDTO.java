package com.sport.academy.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class BranchDTO {
	private int branchID;
	private String branchName;
	private String address;
	private boolean branchStaus;
	private String phone;

}