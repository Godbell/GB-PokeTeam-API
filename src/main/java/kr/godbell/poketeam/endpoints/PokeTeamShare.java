package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.*;

@RestController
public class PokeTeamShare
{
    @GetMapping("/api/v1/poketeam-share")
	public String pokeTeamBuilder()
    {
		return "PokéTeam Share";
	}
}
