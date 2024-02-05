package br.com.alura.frasesaleatorias.service;

import br.com.alura.frasesaleatorias.model.Frase;
import br.com.alura.frasesaleatorias.model.Serie;

public class GeradorDeFrases {

    //Atributos
    private static final String ENDERECO_FIXO = "https://www.omdbapi.com/?apikey=acc2c8e0&t=";

    //Método
    public static Frase obterFrase(Long id, String nomeSerie, String frase, String personagem) {
        String enderecoSerie = ENDERECO_FIXO + nomeSerie.toLowerCase().replace(' ', '+');
        String jsonSerie = ConsumoAPI.obterDados(enderecoSerie);
        var serie = ConverteJson.obterDados(jsonSerie, Serie.class);

        return new Frase(id, frase, personagem, serie.titulo(), serie.poster());
    }

}
