package br.com.desafio;

import org.junit.Test;

public class TesteCriptografia {

	@Test
	public void testarCriptografia() {
		String texto = "Digite aqui o texto para teste";
		Questoes questoes = new Questoes();
		questoes.encriptarTexto(texto);
	
	}
}
