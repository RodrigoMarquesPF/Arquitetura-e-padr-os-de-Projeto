/*Contém métodos para realizar operações especificas de Televisão 
* Como ligar e desligar.
*e aumentar volume que inicia no 2 e vai até o volume 5.
*E a funcionalidade de alterar canal, nesse caso contem 6 canais que são alterados como
*uma lista encadeada. 
**/
public class Televisao {
	private int volume;
	private int canal;
	private static final int MAX_CANAL =6;
	
	public Televisao() {
		this.volume = 2;
		this.canal = 4;
	}
	
	public void ligar() {
		System.out.println("Televisao ligada");
	}
	
	public void desligar() {
		System.out.println("Televisao desligada");
	}
	
	public void aumentarVolume() {
		if(volume < 5) {
			volume ++;
			System.out.println("Volume da televisao aumentada para: " + volume);
		}else {
			System.out.println("Volume do Sistema da Televisao no maximo 5");
		}
		
	}
	
	public void diminuirVolume() {
		if(volume > 1) {
			volume --;
			System.out.println("Volume da televisao aumentada para: " + volume);
		}else {
			System.out.println("Volume da televisao no minimo 1");
		}
	}
	
	public void proximoCanal() {
		canal = (canal % MAX_CANAL) +1;
		System.out.println("Canal da televisao alterado para: " + canal);
	}
	
	public void anteriorCanal() {
		canal = (canal % MAX_CANAL) -1;
		System.out.println("Canal da televisao alterado para: " + canal);
	}
}
