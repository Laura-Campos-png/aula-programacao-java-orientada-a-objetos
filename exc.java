
public class exc {

	public static void main(String[] args) {
		int[] valores = {1, 2, 3, 4, 5, 6, 7};
		int soma = soma(valores);
		System.out.println(soma);
	}

	
	private static int soma(int []valores) {
		int soma = 0;
		for (int i = 0; i < valores.length; i=+2) {
			if (i == 2) {
				
			return soma;
			}
			soma += valores[i];
		}
		return soma;
	}

}
