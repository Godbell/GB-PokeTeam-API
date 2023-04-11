package kr.godbell.poketeam.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.godbell.poketeam.models.PokedexNumbers;
import kr.godbell.poketeam.models.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeApiPokemonService
{
    private final RestTemplate restTemplate;

    @Autowired
    public PokeApiPokemonService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    public Pokemon enrichPokemon(Object idOrName)
    {
        String pokemonURL;
        String pokemonSpeciesURL;
        if (idOrName instanceof String) {
            pokemonURL = "https://pokeapi.co/api/v2/pokemon/" + (String) idOrName;
            pokemonSpeciesURL = "https://pokeapi.co/api/v2/pokemon-species/" + (String) idOrName;
        } else if (idOrName instanceof Integer) {
            pokemonURL = "https://pokeapi.co/api/v2/pokemon/" + ((Integer) idOrName).toString();
            pokemonSpeciesURL = "https://pokeapi.co/api/v2/pokemon-species/" + ((Integer) idOrName).toString();
        } else {
            throw new IllegalArgumentException("idOrName must be a String or an Integer");
        }

        ResponseEntity<String> pokemonResponse
            = restTemplate.getForEntity(
            pokemonURL,
            String.class
        );
        ResponseEntity<String> pokemonSpeciesResponse
            = restTemplate.getForEntity(
            pokemonSpeciesURL,
            String.class
        );

        ObjectMapper objectMapper = new ObjectMapper();
        Pokemon pokemon = null;
        PokedexNumbers pokedexNumbers;

        try {
            pokemon = objectMapper.readValue(pokemonResponse.getBody(), Pokemon.class);
            pokedexNumbers = objectMapper.readValue(pokemonSpeciesResponse.getBody(), PokedexNumbers.class);
            pokemon.setPokedex_numbers(pokedexNumbers.pokedex_numbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pokemon;
    }
}

