package br.edu.sp.cps.fatec.barueri.dmd.aula2do10;

public class Gato {
	
	static String VARIAVEL_GATO = "1";

	String nome; // atributo do gato
	int quantidadedePatas; // atributo do gato
	String cor; // atributo do gato

	public Gato() {

	}

	public Gato(String n, int qtePatas, String c) {
		nome = n;
		quantidadedePatas = qtePatas;
		cor = c;
	}

	public void miar() {
		System.out.println(nome + " : MIAUUUUUU!");
	}
}