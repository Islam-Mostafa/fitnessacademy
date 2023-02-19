package com.sport.academy.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

import com.sport.academy.base.mapper.BaseMapper;
import com.sport.academy.dto.PlayerDTO;
import com.sport.academy.entity.PlayerEntity;

@Mapper(componentModel = "spring",collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)

public interface PlayerMapper extends BaseMapper<PlayerEntity, PlayerDTO> {

//	@Mapping(source  = "coach.coachId", target = "coachId")
//	PlayerDTO mapPlayerEnitityToPlayerDTO(PlayerEntity entity);
//
//	@Mapping(source = " ", target = "coach.coachId")
//	PlayerEntity mapPlayerDTOToPlayerEntity(PlayerDTO playerDTO);
}
