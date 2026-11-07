package io.github.alexasfils.arcade.game.service;

import io.github.alexasfils.arcade.game.web.GameResponseDTO;

public interface IGameService {
    public GameResponseDTO getGameByCode(String gameName);
}
