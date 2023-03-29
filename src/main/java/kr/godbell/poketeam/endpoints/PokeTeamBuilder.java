package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeTeamBuilder
{
    @RequestMapping("/api/v1/poketeam-builder")
	public String pokeTeamBuilder()
    {
		return "PokéTeam Builder";
	}
}
