package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class Team extends BaseModel {

    private String name;
    private String color1;
    private String color2;
}
