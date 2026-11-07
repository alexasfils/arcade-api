package io.github.alexasfils.arcade.game.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<GameEntity, Long> {
    public Optional<GameEntity> getGameByCode(String gameCode);
}
