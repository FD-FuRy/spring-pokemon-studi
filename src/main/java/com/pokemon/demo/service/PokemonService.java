package com.pokemon.demo.service;

import com.pokemon.demo.pojo.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> getAllPokemon();

    List<Pokemon> getAllPokemonByName(String name);

    void updatePokemon(String pokemonName, Pokemon pokemon);

    void createPokemon(Pokemon pokemon);

    void deletePokemon(String name);


}
