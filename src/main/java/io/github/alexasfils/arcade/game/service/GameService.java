package io.github.alexasfils.arcade.game.service;

import io.github.alexasfils.arcade.game.domain.GameEntity;
import io.github.alexasfils.arcade.game.domain.GameRepository;
import io.github.alexasfils.arcade.game.web.GameResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class GameService implements IGameService {
    private final GameRepository gamerepository;

    public GameService(GameRepository gameRepository){
        this.gamerepository = gameRepository;
    }

    @Override
    public GameResponseDTO getGameByCode(String gameCode) {
        GameEntity game = gamerepository.getGameByCode(gameCode).orElseThrow(() -> new RuntimeException("The game was not found"));;

        System.out.println(game.getCode());
        return new GameResponseDTO(
                game.getCode(),
                game.getNameKey(),
                game.getScoreOrder(),
                game.getEnabled()
        );
    }
}
