package com.player.service;

import com.player.db.model.Manager;
import com.player.repo.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService extends AService<Manager> {

    @Autowired
    public ManagerService(ManagerRepository managerRepository) {
        super(managerRepository);
    }
}
