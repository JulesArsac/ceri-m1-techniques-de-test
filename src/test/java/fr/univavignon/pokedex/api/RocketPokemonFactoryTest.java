package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RocketPokemonFactoryTest {

    private RocketPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = new RocketPokemonFactory();
    }

    @Test
    public void testCreatePokemon() {
        Pokemon pokemon = pokemonFactory.createPokemon(1, 613, 64, 4000, 4);
        assertEquals("Bulbasaur", pokemon.getName());
        assertEquals(613, pokemon.getCp());
        assertEquals(64, pokemon.getHp());
        assertEquals(4000, pokemon.getDust());
        assertEquals(4, pokemon.getCandy());
        assertEquals(1, pokemon.getIv(), 0);
    }

}
