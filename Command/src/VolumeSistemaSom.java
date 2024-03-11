
public class VolumeSistemaSom implements Command{
	private SistemaSom sistemaSom;
	
	public VolumeSistemaSom(SistemaSom sistemaSom) {
		this.sistemaSom = sistemaSom;
	}

	@Override
	public void execute() {
		sistemaSom.aumentarVolume();
		
	}

	@Override
	public void undo() {
		sistemaSom.diminuirVolume();
		
	}

}
