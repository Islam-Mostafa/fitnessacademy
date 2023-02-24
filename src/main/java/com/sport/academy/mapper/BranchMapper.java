package com.sport.academy.mapper;

import com.sport.academy.base.mapper.BaseMapper;
import com.sport.academy.dto.BranchDTO;
import com.sport.academy.entity.BranchEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
    collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
    uses = {AcademyMapper.class})

public interface BranchMapper extends BaseMapper<BranchEntity, BranchDTO> {

}
