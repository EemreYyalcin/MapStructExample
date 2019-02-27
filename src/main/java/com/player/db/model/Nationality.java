package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Nationality extends BaseModel{

    private String national;
}
