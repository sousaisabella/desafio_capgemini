package br.com.desafio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestMediana {

@Test
 public void testarMediana() {
 Questoes questoes = new Questoes();
 
	List<Integer> listaDeNumeros = new ArrayList<Integer>();
	
	//Digite os números da lista nas linhas abaixo:
	listaDeNumeros.add(7);
	listaDeNumeros.add(5);
	listaDeNumeros.add(6);
	listaDeNumeros.add(3);
	
	double retorno = questoes.calcularMediana(listaDeNumeros);
	
	System.out.println(retorno);
	}
}

