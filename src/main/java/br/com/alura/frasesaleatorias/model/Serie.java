package br.com.alura.frasesaleatorias.model;

import com.google.gson.annotations.SerializedName;

public record Serie(@SerializedName("Title") String titulo,
                    @SerializedName("Poster") String poster) {
}
