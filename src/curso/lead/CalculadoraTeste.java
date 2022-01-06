package curso.lead;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void somarDoisValores() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void subtrairDoisValores() throws Exception {
		int valorA = 5;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int subtrai = calculadora.subtrai(valorA, valorB);
		
		assertEquals(3, subtrai);
	}
	
	@Test
	public void multiplicarDoisValores() throws Exception {
		int valorA = 1;
		int valorB = 3;
		Calculadora calculadora = new Calculadora();
		int multiplica = calculadora.multiplica(valorA, valorB);
		
		assertEquals(3, multiplica);
	}
	
	@Test
	public void dividirDoisValores() throws Exception {
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int divide = calculadora.divide(valorA, valorB);
		
		assertEquals(3, divide);
	}

}