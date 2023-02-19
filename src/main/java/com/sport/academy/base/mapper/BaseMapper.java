package com.sport.academy.base.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.MappingTarget;

public interface BaseMapper<T,DTO> {
	/**
	 * 
	 * @param t
	 * @return
	 */
	DTO mapEntityToDTO (T t);
	/**
	 * 
	 * @param dto
	 * @return
	 */
	T unMapDTOToEntity (DTO dto);
	/**
	 * 
	 * @param t
	 * @param dto
	 */
	T unMapDTOToEntity (@MappingTarget T t , DTO dto);
	/**
	 * 
	 * @param t
	 * @return
	 */
	List<DTO> mapEntityToDTO (List<T> t);
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	Set<DTO> mapEntityToDTO (Set<T> t);
	/**
	 * 
	 * @param dto
	 * @return
	 */
	List<T> unMapDTOToEntity (List<DTO> dto);
}
