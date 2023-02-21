package com.sport.academy.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sport.academy.dto.BranchDTO;
import com.sport.academy.entity.BranchEntity;
import com.sport.academy.mapper.BranchMapper;
import com.sport.academy.services.BranchService;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BranchController {

private final BranchService branchService;

private final BranchMapper branchMapper;

@GetMapping("/branches")
public List<BranchEntity> getAllBranches() {
	return branchService.findAll();
}

@GetMapping("/branch")
public BranchDTO getBranchById(@RequestParam long branchId) {
	return branchMapper.mapEntityToDTO( branchService.findById(branchId));
}

@PostMapping("/branch")
public long addBranch(@RequestBody BranchDTO branch) {
	return branchService.insert(branchMapper.unMapDTOToEntity(branch)).getId();
}

@PutMapping("/branch")
public long updateBranch(@RequestBody BranchDTO branch) {
	return branchService.update(branchMapper.unMapDTOToEntity(branch)).getId();
}

@DeleteMapping("/branch")
public void deleteBranchById(@RequestParam long coachId) {
	branchService.deleteById(coachId);

}
}
