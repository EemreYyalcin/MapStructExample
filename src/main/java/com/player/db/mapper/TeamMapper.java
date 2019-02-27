package com.player.db.mapper;

import com.player.db.dto.TeamDTO;
import com.player.db.model.Team;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeamMapper {
    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);
    TeamDTO teamToTeamDTO(Team team);
    Team teamDTOToTeam(TeamDTO teamDTO);

}
