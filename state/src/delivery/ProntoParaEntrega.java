package delivery;

public class ProntoParaEntrega extends State {

	public ProntoParaEntrega(CentralDePedido pedido) {
		super(pedido);
	}

	@Override
	public void confirmarRestaurante() {
		System.out.println("Pedido já confirmado e foi entregue para o entregador.");		
	}

	@Override
	public void iniciarPreparo() {
		System.out.println("Pedido já preparado.");
		
	}

	@Override
	public void prontoParaEntrega() {
		System.out.println("Pedido entregue ao entregador.");
		pedido.setState(new SaindoParaEntrega(pedido));
		
	}

	@Override
	public void saiuParaEntrega() {
		System.out.println("Pedido entregue ao entregador.");
		
	}

	@Override
	public void entregue() {
		System.out.println("Pedido entregue ao entregador.");		
	}

}
