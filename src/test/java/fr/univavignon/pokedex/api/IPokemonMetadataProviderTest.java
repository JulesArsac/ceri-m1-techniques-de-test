package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider pokemonMetadataProvider;

    @Before
    public void setUp() throws PokedexException {
        pokemonMetadataProvider = new PokemonMetadataProvider();
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadata pokemonMetadata = pokemonMetadataProvider.getPokemonMetadata(0);
        assertEquals(0, pokemonMetadata.getIndex());
        assertEquals("Bulbizarre", pokemonMetadata.getName());
        assertEquals(126, pokemonMetadata.getAttack());
        assertEquals(126, pokemonMetadata.getDefense());
        assertEquals(90, pokemonMetadata.getStamina());
    }

    @Test
    public void testGetPokemonMetadataException() {
        try {
            pokemonMetadataProvider.getPokemonMetadata(151);
        } catch (PokedexException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }

}
