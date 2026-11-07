package io.github.alexasfils.arcade.game.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true)
    String code;

    @Column(name = "name_key", nullable = false)
    String nameKey;

    @Enumerated(EnumType.STRING)
    @Column(name = "score_order", nullable = false)
    ScoreOrder scoreOrder;

    @Column(nullable = false)
    private Boolean enabled = true;

    protected GameEntity() {}

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getNameKey() {
        return nameKey;
    }

    public ScoreOrder getScoreOrder() {
        return scoreOrder;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public void setScoreOrder(ScoreOrder scoreOrder) {
        this.scoreOrder = scoreOrder;
    }
}
