package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.*;

@RestController
public class PokeTeamBuilder
{
    @GetMapping("/api/v1/poketeam-builder")
	public String pokeTeamBuilder()
    {
		return "PokéTeam Builder";
	}
}
