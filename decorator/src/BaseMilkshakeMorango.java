
public class BaseMilkshakeMorango implements Milkshake {


	@Override
	public void montar() {
		System.out.println("Montando milkshake de morango.");
	}
	

	@Override
	public float preco() {
		return 5.0f;
	}

}
