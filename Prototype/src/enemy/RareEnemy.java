package enemy;

import java.util.ArrayList;
import java.util.List;

public class RareEnemy extends EnemyPrototype {
	private List<String> habilidades;
	
	public RareEnemy(String nome, List<String> habilidades) {
		super(nome);
		this.habilidades = habilidades;
	}

	@Override
	public EnemyPrototype getClone() {
		List<String> cloneHabilidades = new ArrayList<>(habilidades);
        return new RareEnemy(this.nome, cloneHabilidades);
	}
	
	@Override
	public void display() {
		System.out.println("Rare Enemy: " + nome + ", Habilidade: ");
		for (String habilidade : habilidades) {
            System.out.print( "- " + habilidade + "\n");
        }
        System.out.println();
	}

}
