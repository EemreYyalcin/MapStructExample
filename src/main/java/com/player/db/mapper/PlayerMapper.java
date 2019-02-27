package com.player.db.mapper;

import com.player.db.dto.NationalityDTO;
import com.player.db.dto.PlayerDTO;
import com.player.db.model.Nationality;
import com.player.db.model.Player;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerMapper {
    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);
    
    PlayerDTO playerToPlayerDTO(Player player);
    Player playerDTOToPlayer(PlayerDTO playerDTO);

}
