package Tarefa;

public class TarefaSimples implements Tarefa{
	private String nome;
	private boolean concluida;
    
    public TarefaSimples(String nome) {
    	this.nome = nome;
        this.concluida = false;
    }
    
    @Override
    public void concluir() {
        this.concluida = true;
    }
    
    @Override
    public void desfazerConclusao() {
        this.concluida = false;
    }
    
    @Override
    public boolean verificarConclusao() {
        return this.concluida;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
}
