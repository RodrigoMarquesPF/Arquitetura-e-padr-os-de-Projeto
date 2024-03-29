package delivery;

public class Entregue extends State {

	public Entregue(CentralDePedido pedido) {
		super(pedido);
	}

	@Override
	public void confirmarRestaurante() {
		System.out.println("O pedido foi entregue.");		
	}

	@Override
	public void iniciarPreparo() {
		System.out.println("O pedido foi entregue.");			
	}

	@Override
	public void prontoParaEntrega() {
		System.out.println("O pedido foi entregue.");			
	}

	@Override
	public void saiuParaEntrega() {
		System.out.println("O pedido foi entregue.");			
	}

	@Override
	public void entregue() {
		System.out.println("O pedido foi entregue.");			
	}

}
