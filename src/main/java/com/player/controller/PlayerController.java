package com.player.controller;

import com.player.db.dto.PlayerDTO;
import com.player.db.mapper.PlayerMapper;
import com.player.initialize.InitData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("player")
public class PlayerController {


    @GetMapping("/all")
    public ResponseEntity<List<PlayerDTO>> getAllPlayer() {
        return ResponseEntity.ok(PlayerMapper.INSTANCE.playerListToPlayerDTOList(InitData.createPlayers()));
    }


}
