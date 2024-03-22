/* Essa classe e usada como base para criar os decoradores concretos,
 * implementando a interface milkshake e contem um objeto milkshake para
 * decorar
 * 
 */


public abstract class MilkshakeDecorator implements Milkshake{
	protected Milkshake milkshake;
	
	public MilkshakeDecorator(Milkshake milkshake) {
		this.milkshake = milkshake;
	}
	
	public void montar() {
        milkshake.montar();
    }
	
	public float preco() {
		return milkshake.preco();
	}
	

	
}
