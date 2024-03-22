package Factory;

import Personagem.Arqueiro;
import Personagem.Personagem;

public class ArqueiroFactory implements PersonagemFactory{

	@Override
	public Personagem createPersonagem() {
		
		return new Arqueiro();
	}



}
