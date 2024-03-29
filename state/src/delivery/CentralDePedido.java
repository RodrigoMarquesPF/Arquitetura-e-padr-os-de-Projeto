package delivery;

public class CentralDePedido {
	private State state;
	
	public CentralDePedido() {
		this.state = new AguardandoConfirmacao(this);
	}

	public void setState(State state) {
		this.state = state;
	}
	
	//O pedido começa aguardando confirmação de restaurante
	public void confirmaRestaurante() {
		state.confirmarRestaurante(); // Mudança de estado: Aguardando Confirmação -> Em Preparo
	}
	
	//Pedido em preparo
	public void iniciarPreparo() {
		state.iniciarPreparo(); // Mudança de estado: Em Preparo -> Pronto Para Entrega
	}
	
	//Pedido Pronto Para Entrega
    public void prontoParaEntrega() {
        state.prontoParaEntrega();// Mudança de estado: Pronto Para Entrega -> Saiu Para Entrega
    }

    //Pedido Saiu Para Entrega
    public void saiuParaEntrega() {
        state.saiuParaEntrega();// Mudança de estado: Saiu Para Entrega -> Entregue
    }

 // Pedido foi entregue
    public void entregue() {
        state.entregue();
    }
	
	
}
