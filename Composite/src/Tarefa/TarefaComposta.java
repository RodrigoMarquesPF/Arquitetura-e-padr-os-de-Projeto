package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa{
	private String nome;
	private List<Tarefa> subtarefas;
    
    public TarefaComposta(String nome) {
    	this.nome = nome;
        this.subtarefas = new ArrayList<>();
    }
    
    public void adicionarSubtarefa(Tarefa tarefa) {
        this.subtarefas.add(tarefa);
    }
    
    @Override
    public void concluir() {
        for (Tarefa tarefa : subtarefas) {
            tarefa.concluir();
        }
    }
    
    @Override
    public void desfazerConclusao() {
        for (Tarefa tarefa : subtarefas) {
            tarefa.desfazerConclusao();
        }
    }
    
    @Override
    public boolean verificarConclusao() {
        for (Tarefa tarefa : subtarefas) {
            if (!tarefa.verificarConclusao()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    // Método para consultar o estado de todas as tarefas
    public void consultarEstado() {
        consultarEstado(this, 0);
    }
    
    private void consultarEstado(Tarefa tarefa, int nivel) {
        StringBuilder prefixo = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            prefixo.append("  *  ");
        }
        
        if (tarefa instanceof TarefaSimples) {
            System.out.println(prefixo.toString() + tarefa.getNome() + " Simples - Concluida: " + tarefa.verificarConclusao());
        } else if (tarefa instanceof TarefaComposta) {
            System.out.println(prefixo.toString() + tarefa.getNome() + " Composta - Concluida: " + tarefa.verificarConclusao());
            for (Tarefa subtarefa : ((TarefaComposta) tarefa).subtarefas) {
                consultarEstado(subtarefa, nivel + 1);
            }
        }
    }
}
