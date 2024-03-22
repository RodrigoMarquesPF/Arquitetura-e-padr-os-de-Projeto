/*Nessa classe temos o adicional que pode ser adicionado ao Milkshake,
 * essa classe estende a classe abstrata MilkshakeDecorator.
 * */

public class Biscoito extends MilkshakeDecorator {

	public Biscoito(Milkshake m) {
		super(m);
		
	}

	public void montar() {
		super.montar();
        addBiscoito();

	}

	
	public float preco() {
		return super.milkshake.preco() + 10.f;
	}

	private void addBiscoito() {
		System.out.println("Adicionando Biscoito");
	}


	

}
