/*Contém métodos para realizar operações especificas de Sistema de Som
*Como ligar e desligar.
*e aumentar volume que inicia no 3 e vai até o volume 5 
**/
public class SistemaSom {
	private int volume;
	
	public SistemaSom() {
		this.volume = 3;
	}
	
	public void ligar() {
		System.out.println("Sistema de Som ligado");
	}
	
	public void desligar() {
		System.out.println("Sistema de Som Desligado");
	}
	
	public void aumentarVolume() {
		if(volume < 5) {
			volume ++;
			System.out.println("Volume do Sistema de Som aumentado para: " + volume);
		}else {
			System.out.println("Volume do Sistema de Som no maximo 5");
		}
		
	}
	
	public void diminuirVolume() {
		if(volume > 1) {
			volume --;
			System.out.println("Volume do Sistema de Som diminuido para: " + volume);
		}else {
			System.out.println("Volume do Sistema de Som no minimo 1");
		}
	}
	
	
}
