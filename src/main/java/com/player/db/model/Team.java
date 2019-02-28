package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

@Accessors(chain = true)
@Data
@RedisHash("Team")
public class Team extends BaseModel {

    private String name;
    private String color1;
    private String color2;
}
