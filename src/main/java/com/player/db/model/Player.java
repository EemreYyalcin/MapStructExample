package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Player extends Contact {

    private Manager manager;
    private License license;
    private Nationality nationality;





}
