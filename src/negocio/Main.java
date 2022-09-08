package negocio;

public class Main {

	public static void main(String[] args) {

		Filme filme = new Filme("Java muito feliz, o ódio", Genero.ROMANCE);
		Cliente cliente = new Cliente("Klayver", 13, true);

		Locacao locacao = new Locacao();

		try {
			locacao.alugar(cliente, filme);
			System.out.println("Filme alugado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao alugar filme: " + e.getMessage());
		}

	}
}
