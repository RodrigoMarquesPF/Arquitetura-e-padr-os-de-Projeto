package UnidadesMilitares;

import Comandos.AttackStrategy;

public abstract class UnidadesMilitares {
	private AttackStrategy attackStrategy;
	
	public UnidadesMilitares(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
	public void setAttackStrategy (AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
	public void executandoAttack() {
		System.out.println(getClass().getSimpleName() + ": " + attackStrategy.attack());
	}
}
