package kr.godbell.poketeam.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon
{
    /**
     * basic data
     */
    public int id;
    public String name;
    public List<PokedexNumber> pokedex_numbers;

    /**
     * physical data
     */
    public Double weight;
    public Double height;
    public void setWeight(Object weight)
    {
        this.weight = ((Integer)weight).doubleValue() / 10.0;
    }
    public void setHeight(Object height)
    {
        this.height = ((Integer)height).doubleValue() / 10.0;
    }

    /**
     * statical datas
     */
    @JsonProperty("types")
    @JsonDeserialize(using = PokemonTypeDeserializer.class)
    public List<String> types;
    public PokemonStat[] stats;
}