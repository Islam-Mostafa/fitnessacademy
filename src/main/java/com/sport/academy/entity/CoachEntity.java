package com.sport.academy.entity;

import java.util.Date;

import com.sport.academy.base.entity.BaseEntity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Coaches")
public class CoachEntity extends BaseEntity<Long> {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "CoachId")
//	private long coachId;
	@Nonnull
	@Column(name = "FirstName")
	private String firstName;
	@Nonnull
	@Column(name = "LastName")
	private String lastName;
	@Nonnull
	@Column(name = "Address")
	private String address;
	@Nonnull
	@Column(name = "BirthDate")
	private Date birthDate;
	@Nonnull
	@Column(name = "GroupId")
	private int groupId;
	@Nonnull
	@Column(name = "BranchId")
	private int branchId;
	
	@Nonnull
	@Column(name = "Phone")
	private String phone;

}