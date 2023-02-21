package com.sport.academy.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.Date;

import com.sport.academy.base.entity.BaseEntity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "Coaches")
public class CoachEntity extends BaseEntity<Long> {

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
    @Column(name = "GroupId")
    private int groupId;
    @Nonnull
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "branch_id", nullable = false)
    private BranchEntity branchCoaches;

    @ManyToMany(mappedBy = "playersCoach")
    Set<PlayerEntity> players;

    @ManyToOne()
    @JoinColumn(name = "game_id")
    GameEntity coachGame;


}