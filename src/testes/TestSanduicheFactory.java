package testes;

import static org.junit.Assert.*;

import org.junit.Test;
import factory.SanduicheFactory;

public class TestSanduicheFactory {
	
	@Test
	public void testSanduicheSimples() {
		SanduicheFactory.criarSanduicheSimples();
		SanduicheFactory.montarSanduiche();
		assertEquals(
				SanduicheFactory.getString(),
				"Sandu�che Simples\nLista de Ingredientes:\nP�o franc�s\nQueijo mussarela\nPresunto de frango\nOvo de Capoeira\nTomate\n");
	}

	@Test
	public void testSanduicheFrangoCheddar() {
		SanduicheFactory.criarSanduicheFrangoCheddar();
		SanduicheFactory.montarSanduiche();
		assertEquals(
				SanduicheFactory.getString(),
				"Sandu�che de Presunto de Frango e Queijo Cheddar\nLista de Ingredientes:\nP�o bola\nQueijo Cheddar\nPresunto de frango\nOvo de Capoeira\nTomate\n");
	}
	
	@Test
	public void testSanduicheFrangoPrato() {
		SanduicheFactory.criarSanduicheFrangoPrato();
		SanduicheFactory.montarSanduiche();
		assertEquals(
				SanduicheFactory.getString(),
				"Sandu�che de Presunto de Frango e Queijo Prato\nLista de Ingredientes:\nP�o integral\nQueijo prato\nPresunto de frango\nOvo de Capoeira\nTomate\n");
	}
	
	@Test
	public void testSanduichePeruMussarela() {
		SanduicheFactory.criarSanduichePeruMussarela();
		SanduicheFactory.montarSanduiche();
		assertEquals(
				SanduicheFactory.getString(),
				"Sandu�che de Presunto de Peru e Queijo Mussarela\nLista de Ingredientes:\nP�o franc�s\nQueijo mussarela\nPresunto de peito de peru\nOvo de Capoeira\nTomate\n");
	}
}
