package negocio;

public class Main {

	public static void main(String[] args) {

		Transacao transacao = new Transacao();

		Filme filme = new Filme("Java muito feliz, o ódio", Genero.ROMANCE);
		Cliente cliente = new Cliente("Klayver", 13, true);
		Filme filme2 = new Filme("Java muito feliz, o ódio", Genero.ROMANCE);
		Cliente cliente2 = new Cliente("Klayver", 13, true);
		Filme filme3 = new Filme("Java muito feliz, o ódio", Genero.COMEDIA);
		Cliente cliente3 = new Cliente("Klayver", 13, true);

		cliente.setFavoritos(filme);

		Locacao locacao1 = new Locacao();
		Locacao locacao2 = new Locacao();
		Locacao locacao3 = new Locacao();

		try {
			locacao1.alugar(cliente, cliente.getFavorito(0));
			transacao.alugueis.add(locacao1);
			locacao2.alugar(cliente2, filme2);
			transacao.alugueis.add(locacao2);
			locacao3.alugar(cliente3, filme3);
			transacao.alugueis.add(locacao3);
			transacao.generoMaisAlugado();
			System.out.println("Filme alugado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao alugar filme: " + e.getMessage());
		}

	}
}
