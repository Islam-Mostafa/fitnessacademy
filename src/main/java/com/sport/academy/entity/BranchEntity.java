package com.sport.academy.entity;

import com.sport.academy.base.entity.BaseEntity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Branches")
public class BranchEntity extends BaseEntity<Long> {

    @Column(name = "BranchName")
    @Nonnull()
    private String branchName;
    @Column(name = "Address")
    @Nonnull
    private String address;
    @Column(name = "Phone")
    private String phone;

    @Column(name = "IsMainBranch")
    private boolean isMainBranch;

    @Nonnull
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "academy_Id")
    private AcademyEntity academyEntity;


    @ManyToMany(mappedBy = "gameBranches")
    Set<GameEntity> games;

    @OneToMany(mappedBy = "branchCoaches")
    Set<CoachEntity> coaches;

    @OneToMany(mappedBy = "playerBranch")
    Set<PlayerEntity> branchPlayers;
}