package com.sport.academy.dto;

import com.sport.academy.base.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AcademyDTO extends BaseDTO<Long> {
    private String academyName;
}
