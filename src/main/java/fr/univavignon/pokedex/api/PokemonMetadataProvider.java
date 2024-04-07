package fr.univavignon.pokedex.api;

import com.google.gson.*;

import java.util.HashMap;

public class PokemonMetadataProvider implements IPokemonMetadataProvider{

    private static final HashMap<Integer, PokemonMetadata> pokemonMetadataHashMap = new HashMap<>();

    public PokemonMetadataProvider() {
        pokemonMetadataHashMap.put(0, new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
        pokemonMetadataHashMap.put(1, new PokemonMetadata(1, "Herbizarre", 156, 158, 120));
        pokemonMetadataHashMap.put(2, new PokemonMetadata(2, "Florizarre", 198, 200, 160));
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index < 0 || index > 2) {
            throw new PokedexException("Invalid index");
        }
        return pokemonMetadataHashMap.get(index);
    }
}
