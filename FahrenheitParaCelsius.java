import java.util.Scanner;
public class FahrenheitParaCelsius {
	 public static void main(String[] args) {
		 
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o valor em Fahrenheit: ");
	        int f = entrada.nextInt();

	        double c = (f - 32) * (5.0 / 9.0);
	        
	        System.out.println("O valor em Celsius é: " + c);

	        entrada.close();
	    }

}
