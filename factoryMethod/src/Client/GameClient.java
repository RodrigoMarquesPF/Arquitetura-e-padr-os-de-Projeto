package Client;

import Factory.ArqueiroFactory;
import Factory.BruxoFactory;
import Factory.DruidaFactory;
import Factory.GuerreiroFactory;
import Factory.MagoFactory;
import Factory.PersonagemFactory;
import Personagem.Guerreiro;


public class GameClient {

	public static void main(String[] args) {

		PersonagemFactory p1 = new GuerreiroFactory();
		p1.createPersonagem();

		System.out.println();
		
		PersonagemFactory a1 = new ArqueiroFactory();
		a1.createPersonagem();
		
		System.out.println();
		
		PersonagemFactory m1 = new MagoFactory();
		m1.createPersonagem();
		
		System.out.println();
		
		PersonagemFactory m2 = new MagoFactory();
		m2.createPersonagem();
		
		System.out.println();
		
		PersonagemFactory b1 = new BruxoFactory();
		b1.createPersonagem();
		
		System.out.println();
		
		PersonagemFactory d1 = new DruidaFactory();
		d1.createPersonagem();
		
		if (a1 instanceof Guerreiro) {
            System.out.println("O personagem e um Guerreiro!");
        } else {
            System.out.println("O personagem nao e um Guerreiro.");
        }

	}

}
