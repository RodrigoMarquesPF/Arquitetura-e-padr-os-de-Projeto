
public class VolumeTelevisao implements Command {
	private Televisao televisao;
	
	public VolumeTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}

	@Override
	public void execute() {
		televisao.aumentarVolume();
		
	}

	@Override
	public void undo() {
		televisao.diminuirVolume();
		
	}
	

}
