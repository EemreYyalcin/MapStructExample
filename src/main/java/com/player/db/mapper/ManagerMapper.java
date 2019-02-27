package com.player.db.mapper;

import com.player.db.dto.ManagerDTO;
import com.player.db.model.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ManagerMapper {
    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);
    ManagerDTO managerToManagerDTO(Manager manager);
    Manager managerDTOManager(ManagerDTO managerDTO);




}
