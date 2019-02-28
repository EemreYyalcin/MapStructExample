package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class License extends BaseModel {

    private Team team;
    private Date startDate;
    private Date endDate;

}
