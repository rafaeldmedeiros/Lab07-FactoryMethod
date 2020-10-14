package factory;

import interfaces.*;
import ingredientes.*;

public class Sanduiche {
	public Pao adicionarPao() {
		return new PaoFrances();
	}
	
	public Queijo adicionarQueijo() {
		return new QueijoMussarela();
	}
	
	public Presunto adicionarPresunto() {
		return new PresuntoDeFrango();
	}
	
	public Ovo adicionarOvo() {
		return new OvoCapoeira();
	}
	
	public Tomate adicionarTomate() {
		return new Tomate();
	}
	
	@Override
	public String toString() {
		return "Sandu�che Simples";
	}
}
