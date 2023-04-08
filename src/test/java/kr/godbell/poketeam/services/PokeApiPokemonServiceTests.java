package kr.godbell.poketeam.services;

import kr.godbell.poketeam.models.Pokemon;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PokeApiPokemonServiceTests
{
    // Test for the service of /api/v1/pokedex/pokemon
    @Autowired
    private PokeApiPokemonService pokeApiPokemonService;

    @Test
    @DisplayName("Test for the service of /api/v1/pokedex/pokemon")
    void getPokemonTest() {
        // Call Bulbasaur with String
        Pokemon bulbasaur = pokeApiPokemonService.enrichPokemon("bulbasaur");
        Assertions.assertThat(bulbasaur.id == 1);
        Assertions.assertThat(bulbasaur.name == "bulbasaur");

        // Call Ivysaur with Index
        Pokemon ivysaur = pokeApiPokemonService.enrichPokemon(2);
        Assertions.assertThat(ivysaur.id == 2);
        Assertions.assertThat(ivysaur.name == "ivysaur");
    }
}


