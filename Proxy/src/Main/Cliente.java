package Main;

import Recursos.AcessoProxy;
import Recursos.ControleAcesso;
import Recursos.Usuario;

public class Cliente {

	public static void main(String[] args) {
		// Criando proxy para controle de acesso
        ControleAcesso recurso = new AcessoProxy("Lista de funcionarios",1);
        ControleAcesso recurso2 = new AcessoProxy("Confidential Data - Futuros projetos",2);
        

        // Simulando diferentes usuários tentando acessar o recurso
        //O usuário 1 tem a permissão 1 que garante a ele acessar o recurso("Lista de funcionarios")
        //O usuário 2 tem a permissão 2 que garante a ele acessar o recurso("Lista de funcionarios") e o recurso ("Confidential Data - Futuros projetos")
        //O usuário 2 tem a permissão 0 que não garante a ele nenhum nivel de acesso para as informações
        Usuario user1 = new Usuario("usuario1", 1); // Nível de permissão 1
        Usuario user2 = new Usuario("usuario2", 2); // Nível de permissão 2
        Usuario user3 = new Usuario("usuario3", 0); // Nível de permissão 0

        // Testando acesso dos usuários ao recurso
        recurso.acesso(user1); // Acesso permitido (O usuario1 tem permissão nível 1)
        recurso.acesso(user2); // Acesso permitido (O usuario2 tem permissão nível 2)
        recurso.acesso(user3); // Acesso negado (O usuario3 não tem permissão suficiente)
        recurso.acesso(user1); // Acesso permitido (0 usuario1 tem permissão nível 1)
        
        System.out.println();
        recurso2.acesso(user1); // Acesso negado (0 usuario1 não tem permissão suficiente)
        recurso2.acesso(user2); // Acesso permitido (O usuario2 tem permissão nível 2)
        recurso2.acesso(user3); // Acesso negado (0 usuario3 não tem permissão suficiente)

	}

}
