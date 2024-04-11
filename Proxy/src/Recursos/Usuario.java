package Recursos;

public class Usuario {
	private String name;
	private int permisaoLevel;
	
	public Usuario(String name, int permisaoLevel) {
		this.name = name;
		this.permisaoLevel = permisaoLevel;
	}

	public String getName() {
		return name;
	}

	public int getPermisaoLevel() {
		return permisaoLevel;
	}
}
