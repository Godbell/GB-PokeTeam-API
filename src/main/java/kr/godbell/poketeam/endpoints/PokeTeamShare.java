package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeTeamShare
{
    @RequestMapping("/api/v1/poketeam-share")
	public String pokeTeamBuilder()
    {
		return "PokéTeam Share";
	}
}
