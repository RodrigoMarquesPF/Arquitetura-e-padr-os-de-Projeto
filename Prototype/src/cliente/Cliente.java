package cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import enemy.*;

public class Cliente {

	public static void main(String[] args) {
		
		// Criação de inimigos básicos
		EnemyPrototype BasicEnemy = new enemy.BasicEnemy("Slime");
		EnemyPrototype BasicEnemy2 = new enemy.BasicEnemy("Goblin");
		List<EnemyPrototype> basicEnemies = new ArrayList<>();
		
		for (int i =0 ; i<5 ; i++) {
			basicEnemies.add(BasicEnemy.getClone());
			basicEnemies.add(BasicEnemy2.getClone());
		}
		
		// Criação de inimigos raros
		EnemyPrototype rareEnemyPrototype = new RareEnemy("King Slime", Arrays.asList("Acido", "Dividir-se"));
		EnemyPrototype rareEnemyPrototype2 = new RareEnemy("Chefe Goblin", Arrays.asList("Ataques Multiplos", "Redirecionar Ataque"));

		List<EnemyPrototype> rareEnemies = new ArrayList<>();
		
		for (int i=0; i<1; i++) {
			rareEnemies.add(rareEnemyPrototype.getClone());
			rareEnemies.add(rareEnemyPrototype2.getClone());
		}
		
		System.out.println("Inimigos comuns: ");
		for(EnemyPrototype inimigo : basicEnemies) {
			inimigo.display();
		}
		
		System.out.println("\nInimigos Raros\n");
		for(EnemyPrototype inimigo : rareEnemies) {
			inimigo.display();
			System.out.println("\t");
		}
	}

}
