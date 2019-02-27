package com.player.db.dto;

import com.player.db.model.Contact;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PlayerDTO extends ContactDTO {

    private ManagerDTO manager;
    private LicenseDTO license;
    private NationalityDTO nationality;

}
