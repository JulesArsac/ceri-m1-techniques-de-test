package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory {

    public static PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        return new PokemonTrainer(name, team, pokedexFactory.createPokedex(new PokemonMetadataProvider(), new PokemonFactory()));
    }

}
