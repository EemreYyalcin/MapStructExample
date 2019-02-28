package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

@Data
@Accessors(chain = true)
@RedisHash("Nationality")
public class Nationality extends BaseModel {

    private String national;
}
