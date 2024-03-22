
public class Chocolate extends MilkshakeDecorator {

	public Chocolate(Milkshake m) {
		super(m);
		
	}

	public void montar() {
		super.montar();
        addChocolate();

	}

	
	public float preco() {
		return super.milkshake.preco() + 13.f;
	}

	private void addChocolate() {
		System.out.println("Adicionando Chocolate");
	}


	

}
