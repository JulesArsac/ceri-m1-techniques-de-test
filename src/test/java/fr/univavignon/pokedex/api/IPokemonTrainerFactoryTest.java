package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class IPokemonTrainerFactoryTest {
    private PokemonTrainerFactory pokemonTrainerFactory;
    private IPokedexFactory pokedexFactory;
    private IPokedex pokedex;

    @Before
    public void setUp() throws PokedexException {
        pokedexFactory = new PokedexFactory();
        pokemonTrainerFactory = new PokemonTrainerFactory();
    }

    @Test
    public void testCreateTrainer() {
        PokemonTrainer pokemonTrainer = PokemonTrainerFactory.createTrainer("Ash", Team.MYSTIC, pokedexFactory);
        assertEquals("Ash", pokemonTrainer.getName());
        assertEquals(Team.MYSTIC, pokemonTrainer.getTeam());
    }
}
