package br.com.alura.frasesaleatorias;

import br.com.alura.frasesaleatorias.repository.FraseRepository;
import br.com.alura.frasesaleatorias.service.GeradorDeFrases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopularBancoDeDados implements CommandLineRunner {

    @Autowired
    private FraseRepository repositorio;


    public static void main(String[] args) {
        SpringApplication.run(FrasesAleatoriasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var frase = GeradorDeFrases.obterFrase
                (13l, "the office",
                "Antes de fazer qualquer coisa eu me pergunto: " +
                        "Será que um idiota faria isso?. Se a resposta for sim, eu não faço”."
                        ,"Dwight Schrute");

        repositorio.save(frase);
        repositorio.findAll().forEach(System.out::println);


    }
}
