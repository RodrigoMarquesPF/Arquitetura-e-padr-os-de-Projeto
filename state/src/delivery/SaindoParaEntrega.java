package delivery;

public class SaindoParaEntrega extends State{

	public SaindoParaEntrega(CentralDePedido pedido) {
		super(pedido);
	}

	@Override
	public void confirmarRestaurante() {
		System.out.println("Pedido já confirmado e saiu para rota de entrega.");		
	}

	@Override
	public void iniciarPreparo() {
		System.out.println("Pedido já preparado e saiu para rota de entrega.");			
	}

	@Override
	public void prontoParaEntrega() {
		System.out.println("Pedido entregue ao entregador. Saiu para entrega.");			
	}

	@Override
	public void saiuParaEntrega() {
		System.out.println("O pedido saiu para entrega.");
		pedido.setState(new Entregue(pedido));
	}

	@Override
	public void entregue() {
		System.out.println("O pedido saiu para entrega, aguarde o entregador");		
	}

}
