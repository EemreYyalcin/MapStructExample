package com.player.service;

import com.player.db.model.Nationality;
import com.player.repo.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationalityService extends AService<Nationality> {
    @Autowired
    public NationalityService(NationalityRepository nationalityRepository) {
        super(nationalityRepository);
    }
}
