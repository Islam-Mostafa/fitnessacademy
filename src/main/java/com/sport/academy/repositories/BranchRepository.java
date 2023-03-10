package com.sport.academy.repositories;

import org.springframework.stereotype.Repository;

import com.sport.academy.base.repository.BaseRepository;
import com.sport.academy.entity.BranchEntity;
@Repository
public interface BranchRepository extends BaseRepository<BranchEntity, Long> {

}
