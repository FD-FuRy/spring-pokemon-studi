package com.pokemon.demo.service.impl;

import com.pokemon.demo.pojo.Pokemon;
import com.pokemon.demo.service.PokemonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {

    private static List<Pokemon> maListe = new ArrayList<>();

    @Override
    public List<Pokemon> getAllPokemon() {
        return maListe;
    }

    @Override
    public List<Pokemon> getAllPokemonByName(String name) {
        return maListe.stream()
                .filter( pokemon -> pokemon.getSurname().equals(name) )
                .collect(Collectors.toList());
    }

    @Override
    public void updatePokemon(String pokemonName, Pokemon pokemon) {
        this.deletePokemon(pokemonName);
        maListe.add(pokemon);
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        maListe.add(pokemon);
    }

    @Override
    public void deletePokemon(String name) {
        maListe.removeIf( monPokemon -> monPokemon.getSurname().equals(name) );
    }
}
