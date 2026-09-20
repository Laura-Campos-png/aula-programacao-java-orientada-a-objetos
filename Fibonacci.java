
public class Fibonacci {
	public static void main(String[] args) {

        int f1 = 0; 
        int f2 = 1; 

        System.out.println("Os 30 primeiros números de Fibonacci são:");

        for (int i = 1; i <= 30; i++) {
            System.out.println(f1);

            int proximo = f1 + f2; 
            f1 = f2;               
            f2 = proximo;          
        }
    }
}
