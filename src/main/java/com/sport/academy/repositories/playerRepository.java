package com.sport.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.academy.model.PlayerEntity;
@Repository
public interface playerRepository extends JpaRepository<PlayerEntity, Long> {

}
