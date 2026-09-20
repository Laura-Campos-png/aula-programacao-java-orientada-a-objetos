import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        int mil = valor / 1000;
        valor = valor % 1000;

        int cem = valor / 100;
        valor = valor % 100;

        int dez = valor / 10;
        valor = valor % 10;

        int uni = valor % 10;

        System.out.println("Valor de 1000 = " + mil);
        System.out.println("Valor de 100 = " + cem);
        System.out.println("Valor de 10 = " + dez);
        System.out.println("Valor de 1 = " + uni);

        sc.close();
    }
}