import java.util.Arrays;

public class ExercicioCinco {
    public static void main(String[] args) {

        int[] linhas = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[][] matriz = new int[linhas.length][];
        int valor = 1;

        for (int i = 0; i < matriz.length; i++) {
            int quantidade = linhas[i];

            
            if (quantidade > 0) {
                matriz[i] = new int[quantidade];

                for (int j = 0; j < quantidade; j++) {
                    matriz[i][j] = valor++;
                }
            }
        }

        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
