/*Cada dispositivo tem seus próprios comandos concretos, Lampada tem ligar e desligar,
 * Sistema de som tem ligar, desligar, aumentar e diminuir volume,
 * Televisão tem ligar, desligar, aumentar e diminuir volume e trocar de canal.
 * O invokerControleRemoto esta configurado com diferentes comandos para controlar diferentes dispositivos.
 * Cada dispositivo tem suas funcionalidades se tem um comando que o dispositivo não faz e retornado uma mensagem
 * de comando não suportado.
 * */
public class Usuario {

	public static void main(String[] args) {
		InvokerControleRemoto controle = new InvokerControleRemoto();
		
		controle.configureControleLampada();
		controle.configureControleSistemaSom();
		controle.configureControleTelevisao();
		controle.botaoLigar("Ligar Luz");
		controle.botaoDesligar("Desligar Luz");
		controle.botaoLigar("Ligar Luz");
		controle.botaoLigar("Ligar Som");
		controle.aumentarVolume("Aumentar Volume Som");
		controle.aumentarVolume("Aumentar Volume Som");
		controle.aumentarVolume("Aumentar Volume Som");
		controle.aumentarVolume("Aumentar Volume Som");
		controle.aumentarVolume("Aumentar Volume Som");
		controle.aumentarVolume("Aumentar Volume Som");
		controle.diminuirVolume("Diminuir Volume Som");
		controle.diminuirVolume("Diminuir Volume Som");
		controle.diminuirVolume("Diminuir Volume Som");
		controle.diminuirVolume("Diminuir Volume Som");
		controle.diminuirVolume("Diminuir Volume Som");
		controle.diminuirVolume("Altera canal");
		controle.botaoDesligar("Desligar Som");
		controle.botaoDesligar("Desligar Som");
		controle.botaoLigar("Ligar Televisao");
		controle.aumentarVolume("Aumentar Volume TV");
		controle.aumentarVolume("Aumentar Volume TV");
		controle.aumentarVolume("Aumentar Volume TV");
		controle.aumentarVolume("Aumentar Volume TV");
		controle.diminuirVolume("Diminuir Volume TV");
		controle.proximoCanal("Proximo Canal");
		controle.proximoCanal("Proximo Canal");
		controle.proximoCanal("Proximo Canal");
		controle.proximoCanal("Proximo Canal");
		controle.proximoCanal("Proximo Canal");
		controle.proximoCanal("Proximo Canal");
		controle.proximoCanal("Proximo Canal");
		controle.anteriorCanal("Canal Anterior");
		controle.anteriorCanal("Canal Anterior");
		controle.anteriorCanal("Canal Anterior");
		controle.botaoDesligar("Desligar Televisao");
		
	}

}
