
public class LigarLampada implements Command {
	private Lampada lampada;

	public LigarLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	@Override
	public void execute() {
		lampada.ligar();
	}

	@Override
	public void undo() {
		lampada.desligar();
	}

}
