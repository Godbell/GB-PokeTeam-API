package kr.godbell.poketeam.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/********* FROM THIS *********

"stats": [
     {
        "base_stat": 60,
        "effort": 0,
        "stat": {
            "name": "hp",
            "url": "https://pokeapi.co/api/v2/stat/1/"
        }
     }, ...
 ]

 /********* TO THIS *********

 "stats": {
    "hp": 60,
    ...
 }

 */


public class PokemonStatsDeserializer extends JsonDeserializer<PokemonStats> {
    @Override
    public PokemonStats deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
        JsonNode node;
        PokemonStats stats = new PokemonStats();
        try
        {
            node = jsonParser.getCodec().readTree(jsonParser);

            for (JsonNode statNode : node) {
                String statNameNode = statNode.get("stat").get("name").asText();
                int statValue = statNode.get("base_stat").asInt();
                switch (statNameNode) {
                    case "hp" -> stats.hp = statValue;
                    case "attack" -> stats.attack = statValue;
                    case "defense" -> stats.defense = statValue;
                    case "special-attack" -> stats.specialAttack = statValue;
                    case "special-defense" -> stats.specialDefense = statValue;
                    case "speed" -> stats.speed = statValue;
                    default -> throw new IOException("Invalid Stat Name");
                }
            }
        }
        catch (IOException e)
        {
            throw new IOException("Error parsing JSON: " + e.getMessage());
        }
        return stats;
    }
}
