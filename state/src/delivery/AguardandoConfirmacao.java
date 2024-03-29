package delivery;

public class AguardandoConfirmacao extends State {
	
	public AguardandoConfirmacao(CentralDePedido pedido) {
        super(pedido);
    }

	@Override
	public void confirmarRestaurante() {
		System.out.println("Restaurante confirmado. Iniciando preparo.");
        pedido.setState(new EmPreparo(pedido));		
	}

	@Override
	public void iniciarPreparo() {
		System.out.println("O pedido esta aguardando a confirmacao do restaurnte");
	}

	@Override
	public void prontoParaEntrega() {
		System.out.println("O pedido esta aguardando a confirmacao do restaurnte");	
	}

	@Override
	public void saiuParaEntrega() {
		System.out.println("O pedido esta aguardando a confirmacao do restaurnte");	
	}

	@Override
	public void entregue() {
		System.out.println("O pedido esta aguardando a confirmacao do restaurnte");
	}

}
