package com.player.db.mapper;

import com.player.db.dto.TeamDTO;
import com.player.db.model.Team;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class TeamMapper {

    public abstract TeamDTO teamToTeamDTO(Team team);
    public abstract List<TeamDTO> teamListToTeamDTOList(List<Team> teams);
}
