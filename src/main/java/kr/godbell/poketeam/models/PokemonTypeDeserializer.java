package kr.godbell.poketeam.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PokemonTypeDeserializer extends JsonDeserializer<List<String>> {
    @Override
    public List<String> deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
        JsonNode node;
        List<String> types = new ArrayList<>();
        try
        {
            node = jsonParser.getCodec().readTree(jsonParser);

            for (JsonNode typeNode : node) {
                JsonNode nameNode = typeNode.get("type").get("name");
                String name = nameNode.asText();
                types.add(name);
            }
        }
        catch (IOException e)
        {
            throw new IOException("Error parsing JSON: " + e.getMessage());
        }
        return types;
    }
}
