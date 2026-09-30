import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeAluno = "Aluno";
        String nomeProfessor = "Professor";
        boolean aprovado = false;

        for (int tentativas = 0; tentativas <= 10; tentativas++) {
            System.out.println("Tentativa " + tentativas);
            String resposta = sc.nextLine();

            System.out.println("Nota: ");
            double nota = sc.nextDouble();

            if (nota >= 6.0) {
                aprovado = true;
                System.out.println("Aluno aprovado!");
                break;
            } else {
                System.out.println("Aluno reprovado!");
            }

            if (tentativas == 10) {
                System.out.println("Nota insuficiente!");
            }
        }

        sc.close();
    }
}