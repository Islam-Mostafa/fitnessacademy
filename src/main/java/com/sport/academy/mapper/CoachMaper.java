package com.sport.academy.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

import com.sport.academy.base.mapper.BaseMapper;
import com.sport.academy.dto.CoachDTO;
import com.sport.academy.entity.CoachEntity;

@Mapper(componentModel = "spring",
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    uses = {BranchMapper.class, GameMapper.class})
public interface CoachMaper extends BaseMapper<CoachEntity, CoachDTO> {

//	CoachDTO mapCoachEntityToCoachDTO(CoachEntity coachEntity);
}
