package com.player.controller;

import com.player.db.dto.TeamDTO;
import com.player.db.mapper.TeamMapper;
import com.player.db.model.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("team")
public class TeamController {

    @GetMapping("/all")
    public ResponseEntity<TeamDTO> getTeam() {
        Team team = new Team().setName("Fenerbahçe").setColor1("Navy Blue").setColor2("Yellow");
        team.setId(1L);
        TeamDTO teamDTO = TeamMapper.INSTANCE.teamToTeamDTO(team);
        return ResponseEntity.ok(teamDTO);
    }

    @PostMapping("/add")
    public ResponseEntity<Team> addTeam(@RequestBody TeamDTO teamDTO) {
        Team team = TeamMapper.INSTANCE.teamDTOToTeam(teamDTO);
        return ResponseEntity.ok(team);
    }


}
