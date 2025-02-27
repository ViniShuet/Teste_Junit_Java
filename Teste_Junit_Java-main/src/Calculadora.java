
public class Calculadora {

	private int numero1;
	private int numero2;
	private int soma = 0, subtracao = 0, mult = 1;
	private double divisao;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int soma() {
		soma = numero1 + numero2;
		return soma;
	}
	
	public int subtracao() {
		subtracao = numero1 - numero2;
		return subtracao;
	}
	
	public int multiplicacao() {
		mult = numero1 * numero2;
		return mult;
	}
	
	public double divisao() {
		return (double) numero2 / numero1;
	}
	
}
