import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		
		System.out.print("Digite um numero 1: ");
		int num1 = tec.nextInt();
		System.out.print("Digite um numero 2: ");
		int num2 = tec.nextInt();
		
		Calculadora calculadora = new Calculadora(num1, num2);
		
		System.out.println("Soma: " + calculadora.soma());
		System.out.println("Subtracao: " + calculadora.subtracao());
		System.out.println("Multiplicacao: " + calculadora.multiplicacao());
		System.out.println("Divisao: " + calculadora.divisao());
	}

}
