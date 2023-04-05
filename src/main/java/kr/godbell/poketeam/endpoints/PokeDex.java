package kr.godbell.poketeam.endpoints;

import org.springframework.web.bind.annotation.*;

@RestController
public class PokeDex
{
    @GetMapping("/api/v1/pokedex")
	public String pokeDex()
    {
		return "PokéDex";
	}
}
