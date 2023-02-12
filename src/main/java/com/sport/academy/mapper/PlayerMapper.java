package com.sport.academy.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sport.academy.dto.PlayerDTO;
import com.sport.academy.model.PlayerEntity;

@Mapper(componentModel = "spring",collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)

public interface PlayerMapper {

	@Mapping(source  = "coach.coachId", target = "coachId")
	PlayerDTO mapPlayerEnitityToPlayerDTO(PlayerEntity entity);

	@Mapping(source = "coachId", target = "coach.coachId")
	PlayerEntity mapPlayerDTOToPlayerEntity(PlayerDTO playerDTO);
}
