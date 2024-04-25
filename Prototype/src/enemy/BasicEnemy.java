package enemy;

public class BasicEnemy extends EnemyPrototype {
	public BasicEnemy(String nome) {
		super(nome);
	}

	@Override
	public EnemyPrototype getClone() {
		return new BasicEnemy(this.nome);
	}

}
