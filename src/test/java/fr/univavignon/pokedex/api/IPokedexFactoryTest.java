package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPokedexFactoryTest {
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() {
        pokedexFactory = new PokedexFactory();
    }

    @Test
    public void IPokedexFactoryTest() throws PokedexException {
        assertEquals(Pokedex.class, pokedexFactory.createPokedex(new PokemonMetadataProvider(), new PokemonFactory()).getClass());
    }
}
