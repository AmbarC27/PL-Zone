package com.plzone.Demo.PL.stats.app.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayer(String player);

    Optional<Player> findByPlayer(String player);
}
