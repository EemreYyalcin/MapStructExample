package com.player.db.mapper;

import com.player.db.dto.LicenseDTO;
import com.player.db.model.License;
import com.player.service.TeamService;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Setter
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {TeamService.class})
public abstract class LicenseMapper {

    protected TeamMapper teamMapper;
    protected TeamService teamService;

    @Mapping(target = "team", expression = "java(teamMapper.teamToTeamDTO(teamService.findById(license.getTeamId())))")
    public abstract LicenseDTO licenseToLicenseDTO(License license);

}
