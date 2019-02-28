package com.player.db.model;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseModel implements Serializable {
    private String id;
}
