package com.sport.academy.mapper;

import com.sport.academy.base.mapper.BaseMapper;
import com.sport.academy.dto.GameDTO;
import com.sport.academy.entity.GameEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)

public interface GameMapper extends BaseMapper<GameEntity, GameDTO> {

}
