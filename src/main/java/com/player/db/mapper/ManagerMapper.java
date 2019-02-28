package com.player.db.mapper;

import com.player.db.dto.ManagerDTO;
import com.player.db.model.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class ManagerMapper {

    public abstract ManagerDTO managerToManagerDTO(Manager manager);
}
