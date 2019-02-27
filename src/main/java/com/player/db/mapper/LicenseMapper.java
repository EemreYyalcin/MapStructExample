package com.player.db.mapper;

import com.player.db.dto.LicenseDTO;
import com.player.db.model.License;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LicenseMapper {
    LicenseMapper INSTANCE = Mappers.getMapper(LicenseMapper.class);

    @Mapping(target = "team", expression = "java(TeamMapper.INSTANCE.teamToTeamDTO(license.getTeam()))")
    LicenseDTO licenseToLicenseDTO(License license);
    License licenseDTOToLicense(LicenseDTO licenseDTO);

}
