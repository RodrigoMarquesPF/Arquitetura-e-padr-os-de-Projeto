package Tarefa;

public interface Tarefa {
	void concluir();
    void desfazerConclusao();
    boolean verificarConclusao();
    String getNome();
}
