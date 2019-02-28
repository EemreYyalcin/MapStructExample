package com.player.db.mapper;

import com.player.db.dto.PlayerDTO;
import com.player.db.model.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerMapper {
    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    @Mappings({
            @Mapping(target = "license", expression = "java(LicenseMapper.INSTANCE.licenseToLicenseDTO(player.getLicense()))"),
            @Mapping(target = "manager", expression = "java(ManagerMapper.INSTANCE.managerToManagerDTO(player.getManager()))"),
            @Mapping(target = "nationality", expression = "java(NationalityMapper.INSTANCE.nationalityToNationalityDTO(player.getNationality()))"),
            @Mapping(target = "oldTeams", expression = "java(TeamMapper.INSTANCE.teamListToTeamDTOList(player.getOldTeams()))")
    })
    PlayerDTO playerToPlayerDTO(Player player);

    @Mappings({
            @Mapping(target = "license", expression = "java(LicenseMapper.INSTANCE.licenseDTOToLicense(playerDTO.getLicense()))"),
            @Mapping(target = "manager", expression = "java(ManagerMapper.INSTANCE.managerDTOToManager(playerDTO.getManager()))"),
            @Mapping(target = "nationality", expression = "java(NationalityMapper.INSTANCE.nationalityDTOToNationality(playerDTO.getNationality()))"),
            @Mapping(target = "oldTeams", expression = "java(TeamMapper.INSTANCE.teamDTOListToTeamList(playerDTO.getOldTeams()))")
    })
    Player playerDTOToPlayer(PlayerDTO playerDTO);

    List<PlayerDTO> playerListToPlayerDTOList(List<Player> players);
}
