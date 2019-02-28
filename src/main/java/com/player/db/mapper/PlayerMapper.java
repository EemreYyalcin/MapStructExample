package com.player.db.mapper;

import com.player.db.dto.PlayerDTO;
import com.player.db.model.Player;
import com.player.service.LicenseService;
import com.player.service.ManagerService;
import com.player.service.NationalityService;
import com.player.service.TeamService;
import lombok.Setter;
import org.mapstruct.*;

import java.util.List;

@Setter
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {TeamService.class, LicenseService.class, ManagerService.class, NationalityService.class}, injectionStrategy = InjectionStrategy.FIELD)
public abstract class PlayerMapper {

    protected ManagerMapper managerMapper;
    protected LicenseMapper licenseMapper;
    protected TeamMapper teamMapper;
    protected NationalityMapper nationalityMapper;

    protected LicenseService licenseService;
    protected ManagerService managerService;
    protected NationalityService nationalityService;
    protected TeamService teamService;

    @Mappings({
            @Mapping(target = "license", expression = "java(licenseMapper.licenseToLicenseDTO(licenseService.findById(player.getLicenseId())))"),
            @Mapping(target = "manager", expression = "java(managerMapper.managerToManagerDTO(managerService.findById(player.getManagerId())))"),
            @Mapping(target = "nationality", expression = "java(nationalityMapper.nationalityToNationalityDTO(nationalityService.findById(player.getNationalityId())))"),
            @Mapping(target = "oldTeams", expression = "java(teamMapper.teamListToTeamDTOList(teamService.findByIds(player.getOldTeamIds())))")
    })
    public abstract PlayerDTO playerToPlayerDTO(Player player);
    public abstract List<PlayerDTO> playerListToPlayerDTOList(List<Player> players);
}
