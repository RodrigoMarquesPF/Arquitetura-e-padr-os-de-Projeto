package Main;

import Tarefa.TarefaComposta;
import Tarefa.TarefaSimples;

public class Cliente {

	public static void main(String[] args) {
		
		// Criando tarefas
        TarefaSimples tarefa1 = new TarefaSimples("Tarefa 1");
        TarefaSimples tarefa2 = new TarefaSimples("Tarefa 2");
        TarefaSimples tarefa3 = new TarefaSimples("Tarefa 3");
        TarefaSimples tarefa4 = new TarefaSimples("Tarefa 4");
        TarefaSimples tarefa5 = new TarefaSimples("Tarefa 5");
        TarefaSimples tarefa6 = new TarefaSimples("Tarefa 6");
        TarefaSimples tarefa7 = new TarefaSimples("Tarefa 7");
        TarefaSimples tarefa8 = new TarefaSimples("Tarefa 8");
        TarefaSimples tarefa9 = new TarefaSimples("Tarefa 9");
        TarefaSimples tarefa10 = new TarefaSimples("Tarefa 10");
        TarefaSimples tarefa11 = new TarefaSimples("Tarefa 11");
        TarefaSimples tarefa12 = new TarefaSimples("Tarefa 12");
        TarefaSimples tarefa13 = new TarefaSimples("Tarefa 13");
        TarefaSimples tarefa14 = new TarefaSimples("Tarefa 14");
        TarefaSimples tarefa15 = new TarefaSimples("Tarefa 15");
        TarefaSimples tarefa16 = new TarefaSimples("Tarefa 16");
        
        // Criando tarefas compostas
        TarefaComposta tarefaComposta1Nivel3 = new TarefaComposta("Tarefa Composta 1 Nivel 3");
        tarefaComposta1Nivel3.adicionarSubtarefa(tarefa1);
        tarefaComposta1Nivel3.adicionarSubtarefa(tarefa2);
        tarefaComposta1Nivel3.adicionarSubtarefa(tarefa3);
        tarefaComposta1Nivel3.adicionarSubtarefa(tarefa4);
        
        TarefaComposta tarefaComposta2Nivel3 = new TarefaComposta("Tarefa Composta 2 Nivel 3");
        tarefaComposta2Nivel3.adicionarSubtarefa(tarefa5);
        tarefaComposta2Nivel3.adicionarSubtarefa(tarefa6);

        
        TarefaComposta tarefaComposta3Nivel3 = new TarefaComposta("Tarefa Composta 3 Nivel 3");
        tarefaComposta3Nivel3.adicionarSubtarefa(tarefa11);
        tarefaComposta3Nivel3.adicionarSubtarefa(tarefa12);
        tarefaComposta3Nivel3.adicionarSubtarefa(tarefa13);
        tarefaComposta3Nivel3.adicionarSubtarefa(tarefa14);
        tarefaComposta3Nivel3.adicionarSubtarefa(tarefa15);
        
        TarefaComposta tarefaComposta4Nivel3 = new TarefaComposta("Tarefa Composta 4 Nivel 3");
        tarefaComposta4Nivel3.adicionarSubtarefa(tarefa16);
        

        TarefaComposta tarefaComposta5Nivel2 = new TarefaComposta("Tarefa Composta 5 Nivel 2");
        tarefaComposta5Nivel2.adicionarSubtarefa(tarefaComposta1Nivel3);
        tarefaComposta5Nivel2.adicionarSubtarefa(tarefaComposta2Nivel3);
        
        TarefaComposta tarefaComposta6Nivel2 = new TarefaComposta("Tarefa Composta 6 Nivel 2");
        tarefaComposta6Nivel2.adicionarSubtarefa(tarefa7);
        tarefaComposta6Nivel2.adicionarSubtarefa(tarefa8);
        tarefaComposta6Nivel2.adicionarSubtarefa(tarefa9);
        tarefaComposta6Nivel2.adicionarSubtarefa(tarefa10);
        
        
        TarefaComposta tarefaComposta7Nivel2 = new TarefaComposta("Tarefa Composta 7 Nivel 2");
        tarefaComposta7Nivel2.adicionarSubtarefa(tarefaComposta3Nivel3);
        tarefaComposta7Nivel2.adicionarSubtarefa(tarefaComposta4Nivel3);
        
        // Criando tarefa composta de tarefas compostas
        TarefaComposta tarefaCompostaPrincipal = new TarefaComposta("Tarefa Principal");
        tarefaCompostaPrincipal.adicionarSubtarefa(tarefaComposta5Nivel2);
        tarefaCompostaPrincipal.adicionarSubtarefa(tarefaComposta6Nivel2);
        tarefaCompostaPrincipal.adicionarSubtarefa(tarefaComposta7Nivel2);

        System.out.println("Estado de todas as tarefas:");
        System.out.println();
        tarefaCompostaPrincipal.consultarEstado();//Verificar o estado de todas as tarefas
        
        System.out.println();
        System.out.println("Estado de todas as tarefas:");
        System.out.println();
        tarefa1.concluir(); // Concliundo somente uma tarefa simples de Tarefa Composta 1 Nivel 3, ela ainda fica como false
        tarefa7.concluir(); // Concliundo somente uma tarefa simples de Tarefa Composta 6 Nivel 2, ela ainda fica como false
        tarefa8.concluir();// Concliundo somente uma tarefa simples de Tarefa Composta 6 Nivel 2, ela ainda fica como false
        tarefa11.concluir(); //Concluindo as tarefas que corresponde a Tarefa composta tarefa Composta 3 Nivel 3, (11, 12, 13, 14, 15) ela vai ficar como completa.
        tarefa12.concluir();
        tarefa13.concluir();
        tarefa14.concluir();
        tarefa15.concluir();
        tarefaComposta4Nivel3.concluir(); // Concluindo toda a Tarefa composta, tarefa Composta 4 Nivel 3
        tarefaCompostaPrincipal.consultarEstado();
        
        
       
        System.out.println();
        System.out.println("Estado de todas as tarefas:");
        System.out.println();
        tarefaComposta4Nivel3.desfazerConclusao(); //Desfazendo a conclusao da Tarefa composta, Composta4Nivel3
        tarefaCompostaPrincipal.consultarEstado();
        
        
        System.out.println();
        System.out.println("Estado de todas as tarefas:");
        System.out.println();
        //Concluindo todas as tarefas composta, menos a Tarefa Composta 6 Nivel 2
        tarefaComposta5Nivel2.concluir();
        tarefaComposta7Nivel2.concluir();
        tarefaCompostaPrincipal.consultarEstado();
        
        
        System.out.println();
        System.out.println("Estado de todas as tarefas:");
        System.out.println();
        //Concluindo todas as tarefas 
        tarefaComposta6Nivel2.concluir();
        tarefaCompostaPrincipal.consultarEstado();
        
      
        

	}

}
