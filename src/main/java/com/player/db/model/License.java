package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;

@Data
@Accessors(chain = true)
@RedisHash("License")
public class License extends BaseModel {

    private String teamId;
    private Date startDate;
    private Date endDate;

}
