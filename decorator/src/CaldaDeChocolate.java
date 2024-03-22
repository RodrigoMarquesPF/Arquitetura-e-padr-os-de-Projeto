
public class CaldaDeChocolate extends MilkshakeDecorator {

	public CaldaDeChocolate(Milkshake m) {
		super(m);
		
	}

	public void montar() {
		super.montar();
        addCaldaDeChocolate();

	}

	
	public float preco() {
		return super.milkshake.preco() + 16.f;
	}

	private void addCaldaDeChocolate() {
		System.out.println("Adicionando Calda de Chocolate");
	}


	

}
