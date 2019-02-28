package com.player.service;

import com.player.db.model.Team;
import com.player.repo.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService extends AService<Team> {

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        super(teamRepository);
    }

    public List<Team> findByIds(List<String> ids) {
        List<Team> teams = new ArrayList<>();
        ids.forEach(e -> teams.add(findById(e)));
        return teams;
    }


}
