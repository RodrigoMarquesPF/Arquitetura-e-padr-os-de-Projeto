
public class CanalTelevisao implements Command {
	private Televisao televisao;
	
	public CanalTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}
	
	@Override
	public void execute() {
		televisao.proximoCanal();
		
	}

	@Override
	public void undo() {
		televisao.anteriorCanal();
		
	}

}
