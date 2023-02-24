package com.sport.academy.controller;

import com.sport.academy.dto.AcademyDTO;
import com.sport.academy.mapper.AcademyMapper;
import com.sport.academy.services.AcademyService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AcademyController {
    private final AcademyService academyService;
    private final AcademyMapper academyMapper;

    @GetMapping("/academies")
    public List<AcademyDTO> getAllAcademies() {
        return academyMapper.mapEntityToDTO(academyService.findAll());
    }

    @GetMapping("/academy")
    public AcademyDTO getAcademyById(@RequestParam long academyId) {
        return academyMapper.mapEntityToDTO(academyService.findById(academyId));
    }

    @PostMapping("/academy")
    public long addAcademy(@RequestBody AcademyDTO academy) {
        return academyService.insert(academyMapper.unMapDTOToEntity(academy)).getId();
    }

    @PutMapping("/academy")
    public long updateAcademy(@RequestBody AcademyDTO academy) {
        return academyService.update(academyMapper.unMapDTOToEntity(academy)).getId();
    }

    @DeleteMapping("/academy")
    public void deleteAcademyById(@RequestParam long academyId) {
        academyService.deleteById(academyId);

    }
}
