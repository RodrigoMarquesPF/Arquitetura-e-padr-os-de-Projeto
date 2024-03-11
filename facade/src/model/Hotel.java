//Subsistema de Hotel que verifica uma disponibilidade de hotéis na cidade destino e realiza a reserva do quarto para o cliente
package model;

public class Hotel {
	public void verificarDisponibilidadeHoteis(String data, String cidade) {
	        
	        System.out.println("Verificando disponibilidade de hoteis na cidade de " + cidade + " na data " + data);
	    }

	public void reservarHotel(String hotel, int pessoas) {
	        
	        System.out.println("Reservando quarto para " + pessoas + " pessoas no " + hotel );
	    }

}
