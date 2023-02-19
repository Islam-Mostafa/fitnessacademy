package com.sport.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sport.academy.dto.CoachDTO;
import com.sport.academy.entity.CoachEntity;
import com.sport.academy.mapper.CoachMaper;
import com.sport.academy.services.CoachService;

@RestController
@RequestMapping("/api/v1")
public class CoachController {
	@Autowired
	CoachService coachService;
	@Autowired
	CoachMaper coachMaper;
	
	@GetMapping("/coachs")
	public List<CoachEntity> getAllCoachs() {
		return coachService.findAll();
	}

	@GetMapping("/coach")
	public CoachDTO getCoachById(@RequestParam long coachId) {
		return coachMaper.mapEntityToDTO( coachService.findById(coachId));
	}

	@PostMapping("/coach")
	public long addCoach(@RequestBody CoachDTO coach) {
		return coachService.insert(coachMaper.unMapDTOToEntity(coach)).getId();
	}

	@PutMapping("/coach")
	public long updateCoach(@RequestBody CoachDTO coach) {
		return coachService.update(coachMaper.unMapDTOToEntity(coach)).getId();
	}

	@DeleteMapping("/coach")
	public void deleteCoachById(@RequestParam long coachId) {
		coachService.deleteById(coachId);

	}
}
