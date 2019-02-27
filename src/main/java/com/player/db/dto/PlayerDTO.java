package com.player.db.dto;

import com.player.db.model.Contact;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PlayerDTO extends ContactDTO {

    private ManagerDTO managerDTO;
    private LicenseDTO licenseDTO;
    private NationalityDTO nationalityDTO;

}
