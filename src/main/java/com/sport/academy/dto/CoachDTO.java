package com.sport.academy.dto;

import com.sport.academy.base.dto.BaseDTO;
import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CoachDTO extends BaseDTO<Long> {

    private String firstName;
    private String lastName;
    private String address;
    private Date birthDate;
    private String phone;
    private int groupId;
    private BranchDTO branchCoaches;
//    private Set<PlayerDTO> players;
    private GameDTO coachGame;
}