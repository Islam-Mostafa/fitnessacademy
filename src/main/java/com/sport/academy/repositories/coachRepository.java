package com.sport.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.academy.base.repository.BaseRepository;
import com.sport.academy.entity.CoachEntity;
@Repository
public interface coachRepository extends BaseRepository<CoachEntity, Integer>{

}
