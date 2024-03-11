/*A classe ReservasFacade fornece o método 'realizarReservaCompleta()' para simplificar o processo de realizar uma reserva,
 * também e oferecido os métodos 'exibirTodasReservas()' e 'cancelarReserva()'.
 * 
 * O facade cuida da interação com os subsistemas de AluguelCarro, EmpresaAerea, GestaoReserva, Hotel e Pagamento.
 * Os clientes podem chamar o método de 'realizarReservaCompleta()' para realizar a operação completa de uma reserva, sem
 * que ele precise se preocupar com a complexidade interna desses subsistemas.
  */
package model;

import java.time.LocalDate;

public class ReservasFacade {
	private EmpresaAerea reservaVoos;
    private Hotel reservaHoteis;
    private AluguelCarro aluguelCarros;
    private Pagamento pagamentos;
    private GestaoReservas gestaoReservas;

    public ReservasFacade() {
        this.reservaVoos = new EmpresaAerea();
        this.reservaHoteis = new Hotel();
        this.aluguelCarros = new AluguelCarro();
        this.pagamentos = new Pagamento();
        this.gestaoReservas = new GestaoReservas();
    }

    public void realizarReservaCompleta(String dataInicio, String origem, String destino, int dias, boolean alugarCarro, int quantidadePessoas, double valor) {
    	System.out.println("Iniciando processo de reserva para " + destino + " a partir da data de " + dataInicio + " por " + dias + " dias");

        LocalDate dataInicioFormatada = LocalDate.parse(dataInicio);
        LocalDate dataVolta = dataInicioFormatada.plusDays(dias);
        String dataVoltaFormatada = dataVolta.toString();

        reservaVoos.verificarDisponibilidadeVoos(dataInicio, origem, destino);
        reservaVoos.reservarVoo("Solar Linhas Aereas", quantidadePessoas);

        reservaHoteis.verificarDisponibilidadeHoteis(dataInicio, destino);
        reservaHoteis.reservarHotel("Hotel Solares", quantidadePessoas);

        if (alugarCarro) {
            aluguelCarros.verificarDisponibilidadeCarros(dataInicio, destino);
            aluguelCarros.alugarCarro("Subaru", dias);
        }

        pagamentos.processarPagamento(valor);

        gestaoReservas.gerarNumeroReserva(destino);

        System.out.println("Reserva completa para " + destino + " a partir de " + dataInicio + " por " + dias + " dias");
        System.out.println("Data de volta estimada: " + dataVoltaFormatada +"\n");
    }
    
    public void exibirTodasReservas() {
        gestaoReservas.exibirReservas();
    }
    
    public void cancelarReserva(String numeroReserva) {
        gestaoReservas.cancelarReserva(numeroReserva);
    }

}
