package kr.godbell.poketeam.endpoints;

import kr.godbell.poketeam.services.PokeApiPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokeDex
{
	@Autowired
	private final PokeApiPokemonService pokeApiPokemonService;

	public PokeDex(PokeApiPokemonService pokeApiPokemonService)
	{
		this.pokeApiPokemonService = pokeApiPokemonService;
	}

	@GetMapping("/api/v1/pokedex")
	public String pokeDex()
	{
		return "PokéDex";
	}

	@GetMapping("api/v1/pokedex/pokemon/{idOrName}")
	@ResponseBody
	public kr.godbell.poketeam.models.Pokemon pokemon(
			@PathVariable("idOrName") Object idOrName,
			@RequestParam(defaultValue = "en") String lang
		)
	{
		return pokeApiPokemonService.enrichPokemon(idOrName);
	}
}