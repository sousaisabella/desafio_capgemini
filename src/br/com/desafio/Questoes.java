package br.com.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questoes {

	public double calcularMediana(List<Integer> numeros) {
		Collections.sort(numeros);
		double mediana = 0;
		int parImpar = numeros.size() % 2;
		if (parImpar == 1) {
			mediana = numeros.get(numeros.size() / 2);
		} else {
			mediana = (numeros.get(((numeros.size() / 2) - 1)) + (numeros.get(numeros.size() / 2))) / 2;
		}
		return mediana;
	}

	public String calcularPares (int[] elementos,int x) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int diferenca;
		StringBuilder resultado = new StringBuilder();
		int quantidadePares=0;
		
		for(Integer numero : elementos) {
			numeros.add(numero);
		}
		for(Integer n : numeros) {			
			diferenca = n + x;
			if(numeros.contains(diferenca)) {
				resultado.append("["+diferenca+","+ n+ "]");
				quantidadePares++;
				
			}
		}
		resultado.append(" A quantidade de pares é: " + quantidadePares);
		return resultado.toString();
	}
	public void encriptarTexto (String texto) {
		String textoSemEspaco= texto.replaceAll(" ", "");
		int tamanhoTexto = textoSemEspaco.length();
		double raizQuadradaTexto = Math.sqrt(tamanhoTexto);
		long quantidadeLinhas = Math.round(raizQuadradaTexto);
		int contador=0;
		for (int x = 0; x < tamanhoTexto; x = (int) (x + quantidadeLinhas)) {

			for (int y = 0; y < quantidadeLinhas; y++) {
				if (contador < tamanhoTexto) {
					System.out.print(textoSemEspaco.charAt(contador));
				}
				contador++;
			}
			System.out.println();
		}
		
		
	}
}
