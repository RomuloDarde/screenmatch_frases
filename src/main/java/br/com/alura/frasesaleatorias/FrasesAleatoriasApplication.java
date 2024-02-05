package br.com.alura.frasesaleatorias;

import br.com.alura.frasesaleatorias.model.Frase;
import br.com.alura.frasesaleatorias.model.Serie;
import br.com.alura.frasesaleatorias.repository.FraseRepository;
import br.com.alura.frasesaleatorias.service.ConsumoAPI;
import br.com.alura.frasesaleatorias.service.ConverteJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrasesAleatoriasApplication {
	@Autowired
	private  FraseRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(FrasesAleatoriasApplication.class, args);
			}


}
