
public class TesteMatriz {
	public static void main(String[] args) {

		int[][] sala = {
				{1, 0, 0, 1, 1, 0},
				{1, 1, 0, 0, 0, 0},
				{1, 0, 1, 0, 0, 0},
				{1, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{0, 1, 1, 1, 1, 1},
				{1, 0, 1, 0, 1, 1}
		};

		int pessoasPresentes = 0;
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				pessoasPresentes += sala[i][j];
			}
		}

		System.out.println("São " + pessoasPresentes +
				" pessoas presentes");
	}
}