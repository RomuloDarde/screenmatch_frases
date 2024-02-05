package br.com.alura.frasesaleatorias.controller;

import br.com.alura.frasesaleatorias.model.Frase;
import br.com.alura.frasesaleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    //Atributos
    @Autowired
    private FraseRepository repositorio;


    //Métodos GET
    @GetMapping (path = "/series/frases")
    public Frase buscarFraseAleatoria() {
        return repositorio.buscarFraseAleatorioa();
    }




}
