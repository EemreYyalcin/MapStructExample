package com.player.db.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Player extends Contact {

    private Manager manager;
    private License license;
    private Nationality nationality;

    private List<Team> oldTeams = new ArrayList<>();


}
