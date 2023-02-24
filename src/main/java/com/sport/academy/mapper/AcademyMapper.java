package com.sport.academy.mapper;

import com.sport.academy.base.mapper.BaseMapper;
import com.sport.academy.dto.AcademyDTO;
import com.sport.academy.entity.AcademyEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface AcademyMapper extends BaseMapper<AcademyEntity, AcademyDTO> {
}
