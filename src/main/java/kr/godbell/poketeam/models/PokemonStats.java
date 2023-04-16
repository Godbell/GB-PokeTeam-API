package kr.godbell.poketeam.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStats {
    public int hp;
    public int attack;
    public int defense;
    @JsonProperty("special-attack")
    public int specialAttack;
    @JsonProperty("special-defense")
    public int specialDefense;
    public int speed;
}
