CREATE TABLE games(
    id BIGINT AUTO_INCREMENT,
    code VARCHAR(50) UNIQUE NOT NULL,
    name_key VARCHAR(100) NOT NULL,
    score_order VARCHAR(4) NOT NULL DEFAULT 'DESC',
    enabled BOOLEAN NOT NULL DEFAULT TRUE,
    PRIMARY KEY (id),
    CONSTRAINT uk_games_code UNIQUE (code),
    CONSTRAINT ck_games_score_order CHECK (score_order IN ('ASC', 'DESC'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
);