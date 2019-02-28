package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
@RedisHash("Player")
public class Player extends Contact {

    private String managerId;
    private String licenseId;
    private String nationalityId;

    private List<String> oldTeamIds = new ArrayList<>();


}
