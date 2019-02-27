package com.player.db.mapper;

import com.player.db.dto.NationalityDTO;
import com.player.db.model.Nationality;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NationalityMapper {
    NationalityMapper INSTANCE = Mappers.getMapper(NationalityMapper.class);

    NationalityDTO nationalityToNationalityDTO(Nationality nationality);
    Nationality nationalityDTOToNationality(NationalityDTO nationalityDTO);

}
