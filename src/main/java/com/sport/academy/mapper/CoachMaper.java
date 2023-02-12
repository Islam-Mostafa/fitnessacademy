package com.sport.academy.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

import com.sport.academy.dto.CoachDTO;
import com.sport.academy.model.CoachEntity;

@Mapper(componentModel = "spring",collectionMappingStrategy  = CollectionMappingStrategy.ADDER_PREFERRED)
public interface CoachMaper {

	CoachDTO mapCoachEntityToCoachDTO(CoachEntity coachEntity);
}
