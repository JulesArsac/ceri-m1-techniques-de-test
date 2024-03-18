package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IPokedexTest {

    private IPokedex pokedex;

    @Before
    public void setUp() throws PokedexException {
        pokedex = new Pokedex(new PokemonFactory(), new PokemonMetadataProvider());
        pokedex.addPokemon(pokedex.createPokemon(0, 613, 64, 4000, 4));
        pokedex.addPokemon(pokedex.createPokemon(1, 518, 55, 4000, 4));
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        Pokemon pokemon = pokedex.getPokemon(0);
        assertEquals("Bulbizarre", pokemon.getName());
        assertEquals(126, pokemon.getAttack());
        assertEquals(126, pokemon.getDefense());
        assertEquals(90, pokemon.getStamina());
        assertEquals(4, pokemon.getCandy());
    }

    @Test
    public void testGetPokemons() {
        List<Pokemon> pokemons = pokedex.getPokemons();
        assertEquals(2, pokemons.size());
        assertEquals("Bulbizarre", pokemons.get(0).getName());
        assertEquals("Herbizarre", pokemons.get(1).getName());
    }

    @Test
    public void testGetPokemonsSorted() {
        //Sort by name reverse
        List<Pokemon> pokemons = pokedex.getPokemons((p1, p2) -> p2.getName().compareTo(p1.getName()));
        assertEquals(2, pokemons.size());
        assertEquals("Herbizarre", pokemons.get(0).getName());
        assertEquals("Bulbizarre", pokemons.get(1).getName());
    }

}
