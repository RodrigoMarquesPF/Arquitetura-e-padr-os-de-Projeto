/*InvokerControleRemoto  e o invocador
 * 
 * Aqui eu tenho aumentar som de sistema de som e aumentar som Televisão
 * o volumeSistemaSom e volumeTelevisao são parametrizados com os objetos 
 * 'SistemaSom' e 'Televisao', permitindo adaptar os comandos para funcionar
 * com diferentes instâncias de dispositivos sem criar uma classe de comando 
 * para cada uma. O mesmo para ligar e desligar um dispositivo de 'Lampada', 'SistemaSom' e 'Televisao' */
import java.util.HashMap;
import java.util.Map;

public class InvokerControleRemoto {
	private Map<String, Command> commands;
	
	public InvokerControleRemoto() {
		commands = new HashMap<>();
	}
	
	public void configureControleLampada() {
		Lampada lampada = new Lampada();
		Command ligarLuz = new LigarLampada(lampada);
		commands.put("Ligar Luz", ligarLuz);
		commands.put("Desligar Luz", ligarLuz);
		//command = new LigarLuz(lampada);
	}
	
	public void configureControleSistemaSom() {
		SistemaSom sistemaSom = new SistemaSom();
		Command ligarSom = new LigarSistemaSom(sistemaSom);
		Command volume = new VolumeSistemaSom(sistemaSom);
		commands.put("Ligar Som", ligarSom);
		commands.put("Desligar Som", ligarSom);
		commands.put("Aumentar Volume Som", volume);
		commands.put("Diminuir Volume Som", volume);
	}
	
	public void configureControleTelevisao() {
		Televisao televisao = new Televisao();
		Command ligarTelevisao = new LigarTelevisao(televisao);
		Command volume = new VolumeTelevisao(televisao);
		Command canal = new CanalTelevisao(televisao);
		commands.put("Ligar Televisao", ligarTelevisao);
		commands.put("Desligar Televisao", ligarTelevisao);
		commands.put("Aumentar Volume TV", volume);
		commands.put("Diminuir Volume TV", volume);
		commands.put("Proximo Canal", canal);
		commands.put("Canal Anterior", canal);
		
	}
	
	public void botaoLigar(String executar) {
		if(commands.containsKey(executar)) {
			Command command = commands.get(executar);
			command.execute();
		}else {
			System.out.println("Comando nao suportado.");
		}
		//command.execute();
	}
	
	public void botaoDesligar(String executar) {
		if(commands.containsKey(executar)) {
			Command command = commands.get(executar);
			command.undo();
			commands.remove(executar);
		}else {
			System.out.println("Comando nao suportado.");
		}
		//command.undo();
	}
	
	public void aumentarVolume(String executar) {
		if(commands.containsKey(executar)) {
			Command command = commands.get(executar);
			command.execute();
		}else {
			System.out.println("Comando nao suportado.");
		}
	}
	
	public void diminuirVolume(String executar) {
		if(commands.containsKey(executar)) {
			Command command = commands.get(executar);
			command.undo();
		}else {
			System.out.println("Comando nao suportado;");
		}
	}
	
	public void proximoCanal(String executar) {
		if(commands.containsKey(executar)) {
			Command command = commands.get(executar);
			command.execute();
		}else {
			System.out.println("Comando nao suportado.");
		}
	}
	
	public void anteriorCanal(String executar) {
		if(commands.containsKey(executar)) {
			Command command = commands.get(executar);
			command.undo();
		}else {
			System.out.println("Comando nao suportado.");
		}
	}

}
