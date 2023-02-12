package com.sport.academy.model;

import java.util.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class CoachEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CoachId")
	private int coachId;
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
	@Column(name = "CoachStatus")
	private boolean coachStatus;
	@Nonnull
	@Column(name = "Phone")
	private String phone;

}