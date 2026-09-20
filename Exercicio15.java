import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do pai: ");
        double pai = sc.nextDouble();

        System.out.print("Digite a idade do filho: ");
        double filho = sc.nextDouble();

        double base = pai / (filho + 1);

        System.out.println("X = " + base);

        if (base < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (base < 25) {
            System.out.println("Normal");
        } else if (base < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        sc.close();
    }
}