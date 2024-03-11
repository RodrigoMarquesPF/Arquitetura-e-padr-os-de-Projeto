
public class LigarSistemaSom implements Command {
	
	private SistemaSom sistemaSom;

	public LigarSistemaSom (SistemaSom sistemaSom) {
		this.sistemaSom = sistemaSom;
	}

	@Override
	public void execute() {
		sistemaSom.ligar();
		
	}

	@Override
	public void undo() {
		sistemaSom.desligar();
		
	}

}
