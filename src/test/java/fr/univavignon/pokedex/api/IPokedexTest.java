package fr.univavignon.pokedex.api;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexTest {

    IPokedex pokedex;

    @Before
    public void setUp() {
        pokedex = mock(IPokedex.class);
    }

}
