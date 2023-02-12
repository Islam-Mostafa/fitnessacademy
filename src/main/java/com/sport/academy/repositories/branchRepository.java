package com.sport.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.academy.model.BranchEntity;
@Repository
public interface branchRepository extends JpaRepository<BranchEntity, Integer> {

}
