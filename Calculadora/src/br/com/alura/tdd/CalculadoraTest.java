package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {		
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		//equals compara se o valor é correto ou não
		Assert.assertEquals(10, soma);
		
	}

}
