package com.sport.academy.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.sport.academy.model.CoachEntity;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Players")
public class PlayerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long playerId;
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
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="coachId")
	private CoachEntity coach;
	@Nonnull
	@Column(name = "GroupId")
	private int groupId;
	@Nonnull
	@Column(name = "BranchId")
	private int branchId;
	@Nonnull
	@Column(name = "GameId")
	private int gameId;
	@Nonnull
	@Column(name = "PlayerStatus")
	private boolean playerStatus;
	@Nonnull
	@Column(name = "Phone")
	private String phone;
	
}