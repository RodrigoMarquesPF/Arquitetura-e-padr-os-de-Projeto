package delivery;

public abstract class State {
	protected CentralDePedido pedido;
	
	public State(CentralDePedido pedido) {
        this.pedido = pedido;
    }
	
	public abstract void confirmarRestaurante();
	
    public abstract void iniciarPreparo();
    
    public abstract void prontoParaEntrega();
    
    public abstract void saiuParaEntrega();
    
    public abstract void entregue();
}