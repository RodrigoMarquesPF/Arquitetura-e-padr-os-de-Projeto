
public class LigarTelevisao implements Command {
	private Televisao televisao;
	
	public LigarTelevisao (Televisao televisao) {
		this.televisao = televisao;
	}

	@Override
	public void execute() {
		televisao.ligar();
		
	}

	@Override
	public void undo() {
		televisao.desligar();
		
	}
	
	
}
