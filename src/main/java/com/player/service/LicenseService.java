package com.player.service;

import com.player.db.model.License;
import com.player.repo.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService extends AService<License> {
    @Autowired
    public LicenseService(LicenseRepository licenseRepository) {
        super(licenseRepository);
    }
}
