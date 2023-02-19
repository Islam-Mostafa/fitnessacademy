package com.sport.academy.entity;

import com.sport.academy.base.entity.BaseEntity;

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

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name="Branches")
public class BranchEntity extends BaseEntity<Long>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long branchID;
	@Column(name="BranchName")
	@Nonnull()
	private String branchName;
	@Column(name="Address")
	@Nonnull
	private String address;
	@Column(name = "BranchStatus")
	@Nonnull
	private boolean branchStaus;
	@Column(name = "Phone")
	private String phone;
	
}