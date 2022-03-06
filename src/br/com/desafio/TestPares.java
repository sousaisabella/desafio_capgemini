package br.com.desafio;

import org.junit.Test;

public class TestPares {
	@Test
	public void testarPares(){
		Questoes questoes = new Questoes();
		// Digite os números dentro da chaves, separando-os por "," na linha 8.
		int[] numeros = {2,4,6,8};
		String retorno = questoes.calcularPares(numeros , 2);
		System.out.println(retorno);	
	}
}

