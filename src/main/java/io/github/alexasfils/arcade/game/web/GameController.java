package io.github.alexasfils.arcade.game.web;

import io.github.alexasfils.arcade.game.service.IGameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private final IGameService gameService;

    public GameController(IGameService gameService){
        this.gameService = gameService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<GameResponseDTO>getGame(@PathVariable String code) {
        return new ResponseEntity<GameResponseDTO>(gameService.getGameByCode(code), HttpStatus.OK);
    }
}