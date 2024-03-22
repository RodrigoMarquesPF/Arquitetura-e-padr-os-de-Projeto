/*Essa classe implementa a interface Milkshake e fornece 
 * a implementação da base de milkshake sabor chocolate, 
 * assim como a BaseMilkshakeMorango fornece a implemntação 
 * da base de Morango.
 * */
public class BaseMilkshakeChocolate implements Milkshake {


	@Override
	public void montar() {
		System.out.println("Montando milkshake de chocolate.");
	}
	

	@Override
	public float preco() {
		return 10.0f;
	}

}
