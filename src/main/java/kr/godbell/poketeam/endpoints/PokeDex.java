package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.*;

import kr.godbell.poketeam.models.Pokemon;

@RestController
public class PokeDex
{
	@GetMapping("/api/v1/pokedex")
	public String pokeDex()
	{
		return "PokéDex";
	}

	@GetMapping("api/v1/pokedex/pokemon/{idOrName}")
	@ResponseBody
	public Pokemon pokemon(
			@PathVariable("idOrName") String idOrName,
			@RequestParam(defaultValue = "en") String lang
		)
	{
		Pokemon pokemon = new Pokemon();

		pokemon.setId(0);
		pokemon.setName("TEST");

		return pokemon;
	}
}