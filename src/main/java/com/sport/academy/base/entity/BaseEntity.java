package com.sport.academy.base.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
public class BaseEntity<ID extends Number> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private ID id;
	@Nonnull
	@Column(name = "Status")
	private boolean status;
	
	@Column(updatable = false)
	private LocalDate createdDate;

	@Column(updatable = false)
	private String createdUser;

	private LocalDate modifiedDate;

	private String modifiedUser; 
}
