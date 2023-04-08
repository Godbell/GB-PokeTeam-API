package kr.godbell.poketeam.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.godbell.poketeam.models.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeApiPokemonService
{
    @Autowired
    private final RestTemplate restTemplate;

    public PokeApiPokemonService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    public Pokemon enrichPokemon(Object idOrName)
    {
        String url;
        if (idOrName instanceof String) {
            url = "https://pokeapi.co/api/v2/pokemon/" + (String) idOrName;
        } else if (idOrName instanceof Integer) {
            url = "https://pokeapi.co/api/v2/pokemon/" + ((Integer) idOrName).toString();
        } else {
            throw new IllegalArgumentException("idOrName must be a String or an Integer");
        }

        ResponseEntity<String> response
                = restTemplate.getForEntity(
                url,
                String.class
        );

        ObjectMapper objectMapper = new ObjectMapper();
        Pokemon pokemon = null;

        try {
            pokemon = objectMapper.readValue(response.getBody(), Pokemon.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pokemon;
    }
}
