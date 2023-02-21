package com.sport.academy.entity;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Date;

import com.sport.academy.base.entity.BaseEntity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Players")
public class PlayerEntity extends BaseEntity<Long> {
    //	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long playerId;
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
    @Column(name = "Phone")
    private String phone;

    @Nonnull
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
        name = "player_coach",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "coach_id"))
    Set<CoachEntity> playersCoach;
    @Nonnull
    @Column(name = "GroupId")
    private int groupId;

    @Nonnull
    @ManyToOne
    @JoinColumn(name = "branch_Id")
    private BranchEntity playerBranch;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
        name = "player_game",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "game_id"))
    Set<GameEntity> playersGames;



}