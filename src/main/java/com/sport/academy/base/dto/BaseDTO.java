package com.sport.academy.base.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseDTO<ID extends Number> {

	private ID id;
	
	private Integer statusCode;

}