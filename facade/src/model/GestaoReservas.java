/*Subsistema de gestão de reserva, que gera um número quando uma reserva e efetuada
 * aqui o contador já tem 1000 reservas feitas a próxima esse contador aumenta em 1 e a reserva recebe esse número.
 * As reservas são registradas em um Map para exibir elas quando o cliente quiser.
 * O método cancelarReserva necessita de um número de reserva para cancelar ela.
*/

package model;

import java.util.HashMap;
import java.util.Map;



public class GestaoReservas {
	private Map<String, String> reservas;
	private int contador; 

    public GestaoReservas() {
        this.reservas = new HashMap<>();
        this.contador = 1000;
    }
	
	
    public void gerarNumeroReserva(String local) {
        String numeroReserva = gerarNumeroReserva();
        System.out.println("Gerando numero de reserva: " + numeroReserva);
        
      

        reservas.put(numeroReserva, local);
    }
    
    private String gerarNumeroReserva() {
    	return String.valueOf(++contador);
    }
    
    public void exibirReservas() {
        System.out.println("Lista de Reservas:");
        for (Map.Entry<String, String> entry : reservas.entrySet()) {
            System.out.println("Numero de Reserva: " + entry.getKey() + ", Destino : " + entry.getValue());
        }
        System.out.println("\n");
    }
    
    public void cancelarReserva(String numeroReserva) {
        if (reservas.containsKey(numeroReserva)) {
            reservas.remove(numeroReserva);
            System.out.println("Reserva " + numeroReserva + " foi removida com sucesso. \n");
        } else {
            System.out.println("Reserva " + numeroReserva + " nao encontrada. \n");
        }
    }

}
