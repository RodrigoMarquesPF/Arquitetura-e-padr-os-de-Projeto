package enemy;

public abstract class EnemyPrototype {
	protected String nome;
	
	public EnemyPrototype(String nome) {
		this.nome = nome;
	}
	
	public abstract EnemyPrototype getClone();
	
	public void display() {
		System.out.println("Enemy: " + nome);
	}
}
