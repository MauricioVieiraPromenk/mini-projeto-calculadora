package teste;
import java.util.Scanner;

public class outroteste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero qualquer");
		int num1 = scanner.nextInt();
		System.out.println("Digite um numero qualquer 2");
		int num2 = scanner.nextInt();
		int soma = numeros(num1, num2);
		Mensagem();
		System.out.println(soma);
		scanner.close();
	}


public static void Mensagem() {
	System.out.println("Essa é a soma dos dois numeros:");
	
}

public static int numeros(int a, int  b) {
	return a + b;

}
}