package delivery;

public class EmPreparo extends State{

	public EmPreparo(CentralDePedido pedido) {
		super(pedido);
	}

	@Override
	public void confirmarRestaurante() {
		 System.out.println("O pedido ja foi confirmado e esta em preparo");		
	}

	@Override
	public void iniciarPreparo() {
		System.out.println("Pedido sendo preparado. Aguardando conclusão.");
		pedido.setState(new ProntoParaEntrega(pedido));
		
	}

	@Override
	public void prontoParaEntrega() {
		System.out.println("O pedido esta em preparo.");
   
	}

	@Override
	public void saiuParaEntrega() {
		System.out.println("O pedido esta em preparo.");
		
	}

	@Override
	public void entregue() {
		System.out.println("O pedido esta em preparo.");
		
	}

}
