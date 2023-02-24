package com.sport.academy.dto;


import com.sport.academy.base.dto.BaseDTO;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BranchDTO extends BaseDTO<Long> {
    private String branchName;
    private String address;
    private String phone;
    private boolean isMainBranch;
    private AcademyDTO academyDTO;
//    private Set<GameDTO> games;
//    private Set<CoachDTO> coaches;
//    private Set<PlayerDTO> branchPlayers;

}