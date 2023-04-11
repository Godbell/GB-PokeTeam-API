package kr.godbell.poketeam.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokedexNumbers
{
    public List<PokedexNumber> pokedex_numbers;
}