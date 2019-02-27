package com.player.controller;

import com.player.db.dto.LicenseDTO;
import com.player.db.dto.ManagerDTO;
import com.player.db.dto.PlayerDTO;
import com.player.db.dto.TeamDTO;
import com.player.db.mapper.*;
import com.player.db.model.License;
import com.player.db.model.Manager;
import com.player.db.model.Player;
import com.player.db.model.Team;
import com.player.initialize.InitData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("player")
public class PlayerController {


    @GetMapping("/all")
    public ResponseEntity<List<PlayerDTO>> getAllPlayer(){
        List<Player> players = InitData.createPlayer();
        List<PlayerDTO> playerDTOS = new ArrayList<>();

        players.forEach(e -> {
            playerDTOS.add(PlayerMapper.INSTANCE.playerToPlayerDTO(e)
                    .setLicenseDTO(LicenseMapper.INSTANCE.licenseToLicenseDTO(e.getLicense()))
                    .setManagerDTO(ManagerMapper.INSTANCE.managerToManagerDTO(e.getManager()))
                    .setNationalityDTO(NationalityMapper.INSTANCE.nationalityToNationalityDTO(e.getNationality())));
        });
        return ResponseEntity.ok(playerDTOS);
    }








}
