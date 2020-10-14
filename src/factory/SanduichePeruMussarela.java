package factory;

import ingredientes.OvoCapoeira;
import ingredientes.PresuntoPeitoDePeru;
import interfaces.Ovo;
import interfaces.Presunto;

public class SanduichePeruMussarela extends Sanduiche{
	@Override
	public Presunto adicionarPresunto() {
		return new PresuntoPeitoDePeru();
	}

	@Override
	public Ovo adicionarOvo() {
		return new OvoCapoeira();
	}
	
	@Override
	public String toString() {
		return "Sanduíche de Presunto de Peru e Queijo Mussarela";
	}
}
