package com.player.db.mapper;

import com.player.db.dto.NationalityDTO;
import com.player.db.model.Nationality;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class NationalityMapper {

    public abstract NationalityDTO nationalityToNationalityDTO(Nationality nationality);
}
