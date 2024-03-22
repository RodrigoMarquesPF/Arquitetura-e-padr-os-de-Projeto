package Factory;

import Personagem.Mago;
import Personagem.Personagem;

public class MagoFactory implements PersonagemFactory {

	@Override
	public Personagem createPersonagem() {

		return new Mago();
	}

}
