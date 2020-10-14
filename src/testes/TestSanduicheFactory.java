package testes;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import factory.SanduicheFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSanduicheFactory {
	

	//DEVE VIR PRIMEIRO!!
	@Test
	public void first_testSanduicheSemSelecionar() {
		SanduicheFactory.montarSanduiche();
		assertEquals(
				SanduicheFactory.getString(),
				"Sandu�che n�o foi selecionado!");
	}
	
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

	@Test
	public void testSanduicheIndeciso() {
		SanduicheFactory.criarSanduicheSimples();
		SanduicheFactory.montarSanduiche();
		
		SanduicheFactory.criarSanduicheFrangoCheddar();
		
		SanduicheFactory.criarSanduichePeruMussarela();
		SanduicheFactory.montarSanduiche();
		
		assertEquals(
				SanduicheFactory.getString(),
				"Sandu�che de Presunto de Peru e Queijo Mussarela\nLista de Ingredientes:\nP�o franc�s\nQueijo mussarela\nPresunto de peito de peru\nOvo de Capoeira\nTomate\n");
	}
	
}
