package io.github.alexasfils.arcade.game.web;

import io.github.alexasfils.arcade.game.domain.ScoreOrder;

public record GameResponseDTO(String code, String nameKey, ScoreOrder scoreOrder, Boolean enabled) {
    public GameResponseDTO {
    }
}
