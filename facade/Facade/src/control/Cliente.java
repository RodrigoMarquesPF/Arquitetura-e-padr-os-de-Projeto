/*O cliente só tem colocar os dados para fazer uma reserva.
 * Data de início 
 * Local de partida
 * Destino 
 * Dias que pretende ficar 
 * Se quer ou não alugar um carro
 * Quantidade de pessoas
 * Valor 
 * 
 *e possível verificar a lista de todas as reservas feitas e também com o código de uma reserva e possível
 *fazer o cancelamento, o cliente pode fazer tudo isso de forma simples sem interagis diretamente com cada 
 *subsistema, o facade facilita toda a interação.
 *
 * */
package control;

import model.ReservasFacade;

public class Cliente {
	public static void main(String[] args) {
        ReservasFacade facade = new ReservasFacade();
        facade.realizarReservaCompleta("2024-03-02", "Rio de Janeiro", "Phoenix, EUA", 5, true, 2, 15000.0);
        facade.exibirTodasReservas();
        facade.realizarReservaCompleta("2024-03-06", "Sao Paulo", "Viena, Austria", 10, false, 4, 25000.0);
        facade.exibirTodasReservas();
        facade.realizarReservaCompleta("2024-03-07", "Rio de Janeiro", "Salvador, Bahia", 7, false, 1, 5000.0);
        facade.exibirTodasReservas();
        facade.cancelarReserva("1002");
        facade.cancelarReserva("1007");
        facade.exibirTodasReservas();
        facade.realizarReservaCompleta("2024-03-07", "Rio de Janeiro", "Belo Horizonte, Minas Gerais", 2, true, 2, 4000.0);
        facade.exibirTodasReservas();
        
        
    }

}
