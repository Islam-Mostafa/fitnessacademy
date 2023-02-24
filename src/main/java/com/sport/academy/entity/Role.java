package com.sport.academy.entity;

import com.sport.academy.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "sec_roles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BaseEntity<Long> {

    private String name;

}
