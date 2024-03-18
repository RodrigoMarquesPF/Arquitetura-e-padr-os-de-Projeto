package ClientJogo;

import Comandos.AtaqueDefensivo;
import Comandos.AtaqueFlanco;
import Comandos.AtaqueTotal;
import UnidadesMilitares.Artilharia;
import UnidadesMilitares.Blindados;
import UnidadesMilitares.Infantaria;

public class Usuario {

	public static void main(String[] args) {
		
		AtaqueTotal ataqueTotal = new AtaqueTotal();
		AtaqueDefensivo ataqueDefensivo = new AtaqueDefensivo();
		AtaqueFlanco ataqueFlanco = new AtaqueFlanco();
		
		Infantaria infantaria = new Infantaria(ataqueTotal);
		Blindados blindados = new Blindados(ataqueDefensivo);
		Artilharia artilharia = new Artilharia(ataqueTotal);
		

		infantaria.executandoAttack();
		blindados.executandoAttack();
		artilharia.executandoAttack();
		System.out.println();
		
		
		infantaria.setAttackStrategy(ataqueFlanco);
		blindados.setAttackStrategy(ataqueTotal);
		artilharia.setAttackStrategy(ataqueDefensivo);
		
		infantaria.executandoAttack();
		blindados.executandoAttack();
		artilharia.executandoAttack();
		
	}

}
