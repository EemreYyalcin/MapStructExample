package com.player.db.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LicenseDTO {

    private TeamDTO team;
    private Date startDate;

}
