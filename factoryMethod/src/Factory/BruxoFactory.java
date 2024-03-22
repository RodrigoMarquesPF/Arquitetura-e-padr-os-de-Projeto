package Factory;

import Personagem.Bruxo;
import Personagem.Personagem;

public class BruxoFactory implements PersonagemFactory {

	@Override
	public Personagem createPersonagem() {

		return new Bruxo();
	}

}
