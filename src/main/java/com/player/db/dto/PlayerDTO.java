package com.player.db.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PlayerDTO extends ContactDTO {

    private ManagerDTO manager;
    private LicenseDTO license;
    private NationalityDTO nationality;
    private List<TeamDTO> oldTeams;
}
