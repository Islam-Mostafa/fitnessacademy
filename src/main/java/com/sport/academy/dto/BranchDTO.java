package com.sport.academy.dto;


import com.sport.academy.base.dto.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class BranchDTO extends BaseDTO<Long> {
//	private long branchID;
	private String branchName;
	private String address;
//	private boolean branchStaus;
	private String phone;

}