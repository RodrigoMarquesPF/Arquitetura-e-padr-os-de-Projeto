//Subsistema de EmpresaAerea que verifica uma disponibilidade de voo para o destino e realiza a reserva no voo para o cliente
package model;

public class EmpresaAerea {
	public void verificarDisponibilidadeVoos(String data, String origem, String destino) {
		System.out.println("Verificar disponibilidade de voo para " + origem + " - " + destino + " na data " + data);
	}

	
	public void reservarVoo(String voo, int assentos) {
       System.out.println("Reservando " + assentos + " assentos " + " no voo " + voo);
    }
}
