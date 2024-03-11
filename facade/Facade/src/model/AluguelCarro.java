/*Subsistema de Aluguel de carro que verifica uma disponibilidade de carros para alugar na cidade destino
*e realiza a reserva do carro para o cliente.
*/
package model;

public class AluguelCarro {
	public void verificarDisponibilidadeCarros(String data, String cidade) {
        System.out.println("Verificando disponibilidade de carro para aluguel na cidade de " + cidade + " na data " + data);
    }

    public void alugarCarro(String modelo, int dias) {
        System.out.println("Alugando carro modelo " + modelo + " por " + dias + " dias");
    }

}
