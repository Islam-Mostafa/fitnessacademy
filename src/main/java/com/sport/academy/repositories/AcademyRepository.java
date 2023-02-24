package com.sport.academy.repositories;

import com.sport.academy.base.repository.BaseRepository;
import com.sport.academy.entity.AcademyEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademyRepository extends BaseRepository<AcademyEntity,Long> {
}
