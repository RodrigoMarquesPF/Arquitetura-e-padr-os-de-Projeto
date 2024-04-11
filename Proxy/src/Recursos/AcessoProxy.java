package Recursos;

import java.util.HashMap;
import java.util.Map;

public class AcessoProxy implements ControleAcesso{
	private Map<String, Integer> permissao;
    private String recursoNome;
    private int requiredPermissionLevel;
    
    
    public AcessoProxy(String recursoNome , int requiredPermissionLevel) {
    	permissao = new HashMap<>();
        // Simulando permissões de usuários
    	permissao.put("usuario1", 1); // Nível de permissão 1
    	permissao.put("usuario2", 2); // Nível de permissão 2

        this.recursoNome = recursoNome;
        this.requiredPermissionLevel = requiredPermissionLevel;
    }
    
    
    @Override
    public void acesso(Usuario usuario) {
        Integer PermissaoNecessaria = permissao.get(usuario.getName());
        if (PermissaoNecessaria != null && PermissaoNecessaria >= requiredPermissionLevel) {
            System.out.println("Acessando recurso:  " + recursoNome + " ---- Usuario : " + usuario.getName());
            System.out.println("Acesso registrado para " + usuario.getName() + ", acessando " + "----"  + recursoNome + "----" );
            System.out.println("");
        } else {
            System.out.println("Acesso negado para o usuario: " + usuario.getName());
            System.out.println("");
        }
    }

}
