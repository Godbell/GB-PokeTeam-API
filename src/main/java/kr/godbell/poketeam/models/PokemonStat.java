package kr.godbell.poketeam.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStat {
    public String name;
    public int base_stat;

    public void setStat(Map<String,Object> stat) {
        this.name = (String)stat.get("name");
    }
}
