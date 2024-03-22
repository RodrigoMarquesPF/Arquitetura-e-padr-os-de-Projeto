
public class Frutas extends MilkshakeDecorator {

	public Frutas(Milkshake m) {
		super(m);
		
	}

	public void montar() {
		super.montar();
        addFrutas();

	}

	
	public float preco() {
		return super.milkshake.preco() + 4.f;
	}

	private void addFrutas() {
		System.out.println("Adicionando Frutas");
	}


	

}
