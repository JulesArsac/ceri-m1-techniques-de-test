package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory {

        public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
            try {
                PokemonMetadata pokemonMetadata = new PokemonMetadataProvider().getPokemonMetadata(index);
                return new Pokemon(index, pokemonMetadata.getName(), pokemonMetadata.getAttack(), pokemonMetadata.getDefense(), pokemonMetadata.getStamina(), cp, hp, dust, candy, 56.0);
            } catch (PokedexException e) {
                e.printStackTrace();
            }
            return null;
        }
}
