package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    private PokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = new PokemonFactory();
    }

    @Test
    public void testCreatePokemon() {
        Pokemon pokemon = pokemonFactory.createPokemon(0, 613, 64, 4000, 4);
        assertEquals("Bulbizarre", pokemon.getName());
        assertEquals(126, pokemon.getAttack());
        assertEquals(126, pokemon.getDefense());
        assertEquals(90, pokemon.getStamina());
        assertEquals(613, pokemon.getCp());
        assertEquals(64, pokemon.getHp());
        assertEquals(4000, pokemon.getDust());
        assertEquals(4, pokemon.getCandy());
        assertEquals(56.0, pokemon.getIv(), 0);
    }

}
