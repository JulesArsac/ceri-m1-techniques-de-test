package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {

    private List<Pokemon> pokedex;
    private PokemonFactory pokemonFactory;
    private PokemonMetadataProvider pokemonMetadataProvider;

    public Pokedex(PokemonFactory pokemonFactory, PokemonMetadataProvider pokemonMetadataProvider) {
        pokedex = new ArrayList<>();
        this.pokemonFactory = pokemonFactory;
        this.pokemonMetadataProvider = pokemonMetadataProvider;
    }

    @Override
    public int size() {
        return pokedex.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
        return pokedex.indexOf(pokemon);
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        if (id < 0 || id >= pokedex.size()) {
            throw new PokedexException("Invalid index");
        }
        return pokedex.get(id);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return pokedex;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        pokedex.sort(order);
        return pokedex;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return pokemonMetadataProvider.getPokemonMetadata(index);
    }
}
