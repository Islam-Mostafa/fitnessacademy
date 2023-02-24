package com.sport.academy.services;

import com.sport.academy.base.service.BaseService;
import com.sport.academy.entity.AcademyEntity;
import com.sport.academy.repositories.AcademyRepository;
import org.springframework.stereotype.Service;

@Service
public class AcademyService extends BaseService<AcademyEntity,Long, AcademyRepository> {
}
