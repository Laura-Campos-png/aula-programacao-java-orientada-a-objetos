import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    int a = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado = " + (a + b));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextInt();
                    System.out.println("Resultado = " + (a - b));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextInt();
                    System.out.println("Resultado = " + (a * b));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = sc.nextInt();
                    System.out.println("Resultado = " + (a / b));
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 5);

        sc.close();
    }
}