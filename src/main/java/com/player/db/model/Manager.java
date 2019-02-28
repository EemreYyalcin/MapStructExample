package com.player.db.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Manager")
public class Manager extends Contact {

    private String nationalityId;

}
