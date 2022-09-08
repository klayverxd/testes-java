package negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Locacao {

	protected Cliente cliente;
	protected Filme filme;
	protected String data;
	protected String hora;
	
	public void alugar(Cliente cliente, Filme filme) {
		if(!cliente.ativo) {
			throw new RuntimeException("Cliente deve estar ativo para alugar um filme");
		}
		
		this.cliente = cliente;
		this.filme = filme;
		
		DateTimeFormatter dtfData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtfHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now();
		
		this.data = dtfData.format(ldt);
		this.hora = dtfHora.format(ldt);
	}
}
