package br.com.alura.frasesaleatorias.service;

import com.google.gson.Gson;

public class ConverteJson {
    public static <T> T obterDados (String json, Class<T> classe) {
        return new Gson().fromJson(json, classe);
    }
}
