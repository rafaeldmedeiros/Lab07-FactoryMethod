package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.Sanduiche;
import factory.SanduicheFrangoCheddar;
import factory.SanduicheFrangoPrato;
import factory.SanduichePeruMussarela;
import ingredientes.OvoCapoeira;
import ingredientes.PaoBola;
import ingredientes.PaoFrances;
import ingredientes.PaoIntegral;
import ingredientes.PresuntoDeFrango;
import ingredientes.PresuntoPeitoDePeru;
import ingredientes.QueijoCheddar;
import ingredientes.QueijoMussarela;
import ingredientes.QueijoPrato;
import ingredientes.Tomate;

public class SanduicheTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSimplesString() {
		Sanduiche sanduba = new Sanduiche();
		assertEquals(sanduba.toString(), "Sanduíche Simples");
	}
	
	@Test
	public void testFrangoCheddarString() {
		Sanduiche sanduba = new SanduicheFrangoCheddar();
		assertEquals(sanduba.toString(), "Sanduíche de Presunto de Frango e Queijo Cheddar");
	}
	
	@Test
	public void testFrangoPratoString() {
		Sanduiche sanduba = new SanduicheFrangoPrato();
		assertEquals(sanduba.toString(), "Sanduíche de Presunto de Frango e Queijo Prato");
	}
	
	@Test
	public void testPeruMussarelaString() {
		Sanduiche sanduba = new SanduichePeruMussarela();
		assertEquals(sanduba.toString(), "Sanduíche de Presunto de Peru e Queijo Mussarela");
	}
	
	@Test
	public void testSimplesIngredientes() {
		Sanduiche sanduba = new Sanduiche();
		assertTrue(sanduba.adicionarPao() instanceof PaoFrances);
		assertTrue(sanduba.adicionarQueijo() instanceof QueijoMussarela);
		assertTrue(sanduba.adicionarPresunto() instanceof PresuntoDeFrango);
		assertTrue(sanduba.adicionarOvo() instanceof OvoCapoeira);
		assertTrue(sanduba.adicionarTomate() instanceof Tomate);
	}
	
	@Test
	public void testFrangoCheddarIngredientes() {
		Sanduiche sanduba = new SanduicheFrangoCheddar();
		assertTrue(sanduba.adicionarPao() instanceof PaoBola);
		assertTrue(sanduba.adicionarQueijo() instanceof QueijoCheddar);
		assertTrue(sanduba.adicionarPresunto() instanceof PresuntoDeFrango);
		assertTrue(sanduba.adicionarOvo() instanceof OvoCapoeira);
		assertTrue(sanduba.adicionarTomate() instanceof Tomate);
	}
	
	@Test
	public void testFrangoPratoIngredientes() {
		Sanduiche sanduba = new SanduicheFrangoPrato();
		assertTrue(sanduba.adicionarPao() instanceof PaoIntegral);
		assertTrue(sanduba.adicionarQueijo() instanceof QueijoPrato);
		assertTrue(sanduba.adicionarPresunto() instanceof PresuntoDeFrango);
		assertTrue(sanduba.adicionarOvo() instanceof OvoCapoeira);
		assertTrue(sanduba.adicionarTomate() instanceof Tomate);
	}
	
	@Test
	public void testPeruMussarelaIngredientes() {
		Sanduiche sanduba = new SanduichePeruMussarela();
		assertTrue(sanduba.adicionarPao() instanceof PaoFrances);
		assertTrue(sanduba.adicionarQueijo() instanceof QueijoMussarela);
		assertTrue(sanduba.adicionarPresunto() instanceof PresuntoPeitoDePeru);
		assertTrue(sanduba.adicionarOvo() instanceof OvoCapoeira);
		assertTrue(sanduba.adicionarTomate() instanceof Tomate);
	}
}
