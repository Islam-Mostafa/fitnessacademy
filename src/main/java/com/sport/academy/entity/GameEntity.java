package com.sport.academy.entity;

import com.sport.academy.base.entity.BaseEntity;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name = "Games")
public class GameEntity extends BaseEntity<Long> {

    @Nonnull
    @Column(name = "GameName")
    private String gameName;
    @Column(name = "GameDescription")
    private String gameDescription;

    @Nonnull
    @ManyToMany
    @JoinTable(
        name = "branch_game",
        joinColumns = @JoinColumn(name = "game_id"),
        inverseJoinColumns = @JoinColumn(name = "branch_id"))
    Set<BranchEntity> gameBranches;

    @Nonnull
    @OneToMany(mappedBy = "coachGame")
    Set<CoachEntity> gameCoaches;
    @ManyToMany(mappedBy = "playersGames")
    Set<PlayerEntity> gamePlayers;
}
