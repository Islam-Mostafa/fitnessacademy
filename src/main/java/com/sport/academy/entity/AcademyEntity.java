package com.sport.academy.entity;

import com.sport.academy.base.entity.BaseEntity;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Academy")
public class AcademyEntity extends BaseEntity<Long> {
    @Column(name="AcademyName")
    @Nonnull()
    private String branchName;
}
