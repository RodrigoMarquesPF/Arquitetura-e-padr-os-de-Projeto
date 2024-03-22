package Factory;

import Personagem.Guerreiro;
import Personagem.Personagem;

public class GuerreiroFactory implements PersonagemFactory {

	@Override
	public Personagem createPersonagem() {

		return new Guerreiro();
	}

}
