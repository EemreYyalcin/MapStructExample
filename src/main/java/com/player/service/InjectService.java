package com.player.service;

import com.player.db.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InjectService {

    @Autowired
    private LicenseService licenseService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private NationalityService nationalityService;

    @Autowired
    private TeamService teamService;

    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private LicenseMapper licenseMapper;

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private ManagerMapper managerMapper;

    @Autowired
    private NationalityMapper nationalityMapper;

    @PostConstruct
    public void init() {
        playerMapper.setLicenseMapper(licenseMapper);
        playerMapper.setLicenseService(licenseService);
        playerMapper.setManagerMapper(managerMapper);
        playerMapper.setManagerService(managerService);
        playerMapper.setNationalityMapper(nationalityMapper);
        playerMapper.setNationalityService(nationalityService);
        playerMapper.setTeamMapper(teamMapper);
        playerMapper.setTeamService(teamService);

        licenseMapper.setTeamMapper(teamMapper);
        licenseMapper.setTeamService(teamService);
    }


}
