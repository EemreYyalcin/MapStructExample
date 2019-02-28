package com.player.service;

import com.player.db.model.Player;
import com.player.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService extends AService<Player> {

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        super(playerRepository);
    }

}
