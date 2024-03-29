package usuario;

import delivery.CentralDePedido;

public class Cliente {

	public static void main(String[] args) {
		CentralDePedido pedido01 = new CentralDePedido();
		pedido01.entregue();// Continua no estado de aguardando confirmação do restaurante
		pedido01.confirmaRestaurante();// Mudança de estado: Aguardando Confirmação do restaurante -> Em Preparo
		pedido01.entregue();// Continua no estado de Em Preparo
		pedido01.iniciarPreparo();// Mudança de estado: Em Preparo -> Pronto Para Entrega
		
		System.out.println("");
		pedido01.entregue();// Continua no estado de Pronto Para Entrega
		pedido01.prontoParaEntrega();// Mudança de estado: Pronto Para Entrega -> Saiu Para Entrega
		pedido01.entregue();// Continua no estado de Saiu Para Entrega
		pedido01.saiuParaEntrega();// Mudança de estado: Saiu Para Entrega -> Entregue
		
		System.out.println("");
		pedido01.entregue();// Estado final de Entregue
		pedido01.confirmaRestaurante();// Estado final de Entregue
		pedido01.saiuParaEntrega();// Estado final de Entregue
	}

}
