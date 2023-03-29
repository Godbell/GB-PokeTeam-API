package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeDex
{
    @RequestMapping("/api/v1/pokedex")
	public String pokeDex()
    {
		return "PokéDex";
	}
}
