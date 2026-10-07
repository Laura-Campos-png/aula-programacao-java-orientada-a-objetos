package br.edu.sp.cps.fatec.barueri.dmd.aula2do10;

public class Main {
	public static void main(String[] args) {

		Gato g1 = new Gato("nome", 4, "SIAMÊS");

		Gato g2 = new Gato("nome", 4, "LARANJA E BRANCO");
		

		// System.out.println(g1.nome);
		// g1.nome = "Brisa";
		// System.out.println(g1.nome);
		
		// System.out.println(g2.nome);
		// g2.nome = "Larica";
		// System.out.println(g2.nome);
		
		System.out.println(g1.VARIAVEL_GATO);
		g1.VARIAVEL_GATO = "2";
		
		System.out.println(g2.VARIAVEL_GATO);
	
		

	}

}
