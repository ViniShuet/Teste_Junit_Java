import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void testesoma10com9() {
		//Variavel com valor esperado do teste
		int valorEsperado = 19;
		//Variavel para receber o valor real da simulacao
		int valorReal;
		
		//Execucao do calculo
		Calculadora calc = new Calculadora(10,9);
		valorReal = calc.soma();
		
		//Validacao do resultado
		//Comparar o valorReal com o valorEsperado
		assertEquals(valorReal, valorEsperado);
	}
	
	@Test
	public void testesoma9com9() {
		
		int valorEsperado = 18;
		int valorReal;
		
		//Execucao do calculo
		Calculadora calc = new Calculadora(9,9);
		valorReal = calc.soma();
		
		assertEquals(valorReal, valorEsperado);
	}
			
	
	@Test
	public void testesubtracao10com9() {
		int valorEsperado = 1;
		int valorReal;
		
		Calculadora calc = new Calculadora(10, 9);
		valorReal = calc.subtracao();
		
		assertEquals(valorReal, valorEsperado);
	}
	
	@Test
	public void testemultiplicacao5com10() {
		int valorEsperado = 50;
		int valorReal;
		
		Calculadora calc = new Calculadora(5, 10);
		valorReal = calc.multiplicacao();
		
		assertEquals(valorReal, valorEsperado);
	}
	
	@Test
	public void testedivisao3com2() {
		double valorEsperado = 1.5;
		double valorReal;
		
		Calculadora calc = new Calculadora(2, 3);
		valorReal = calc.divisao();
		
		assertEquals(valorReal, valorEsperado, 0.5);
	}

}
