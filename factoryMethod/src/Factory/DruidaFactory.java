package Factory;

import Personagem.Druida;
import Personagem.Personagem;

public class DruidaFactory implements PersonagemFactory {

	@Override
	public Personagem createPersonagem() {

		return new Druida();
	}

}
