package com.player.db.model;

import lombok.Data;

import java.util.Date;

@Data
public abstract class Contact extends BaseModel{
    private String name;
    private String lastname;
    private Date birthDate;

}
