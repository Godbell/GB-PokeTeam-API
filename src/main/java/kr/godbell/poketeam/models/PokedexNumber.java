package kr.godbell.poketeam.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokedexNumber
{
    public String region;
    public int entry_number;

    public void setPokedex(Map<String, Object> pokedex)
    {
        region = (String)pokedex.get("name");
    }
}