package com.sport.academy.base.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sport.academy.base.repository.BaseRepository;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseService<T, ID extends Number,Repository extends BaseRepository> {

	@Autowired
	private Repository baseRepository;

	/**
	 * 
	 * @return
	 */
	public List<T> findAll() {
		return baseRepository.findAll();
	}

	/**
	 * @param id
	 * @return
	 */
	public T findById(ID id) {
		return (T) baseRepository.findById(id).orElse(null);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public T getOne(ID id) {
		return (T) baseRepository.getById(id);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Optional<T> getById(ID id) {
		return baseRepository.findById(id);
	}

	/**
	 * @param entity
	 * @return
	 */
	public T insert(T entity) {
		return (T) baseRepository.save(entity);

	}

	/**
	 * @param entity
	 * @return
	 */
	public T persist(T entity) {
		return (T) baseRepository.saveAndFlush(entity);

	}

	/**
	 *
	 */
	public T update(T entity) {
		return (T) baseRepository.save(entity);
	}

	/**
	 * @param id
	 * @return
	 */
	public void deleteById(ID id) {
		baseRepository.deleteById(id);
	}

	/**
	 * @param ids
	 */
	public void deleteAll(List<ID> ids) {
		ids.forEach(id -> {
			baseRepository.deleteById(id);
		});
	}

}
