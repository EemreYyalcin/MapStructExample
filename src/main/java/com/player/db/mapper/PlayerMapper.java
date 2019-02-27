package com.player.db.mapper;

import com.player.db.dto.*;
import com.player.db.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerMapper {
    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    @Mappings( {
            @Mapping(target = "license", expression="java(LicenseMapper.INSTANCE.licenseToLicenseDTO(player.getLicense()))"),
            @Mapping(target = "manager", expression = "java(ManagerMapper.INSTANCE.managerToManagerDTO(player.getManager()))"),
            @Mapping(target = "nationality", expression = "java(NationalityMapper.INSTANCE.nationalityToNationalityDTO(player.getNationality()))"),
            })
    PlayerDTO playerToPlayerDTO(Player player);

    Player playerDTOToPlayer(PlayerDTO playerDTO);


}
