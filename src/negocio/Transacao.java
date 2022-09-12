package negocio;

import java.util.ArrayList;

public class Transacao {

	protected ArrayList<Locacao> alugueis;

	public Transacao() {
		alugueis = new ArrayList<Locacao>();
	}

	public double valorLocacaoTotal() {
		double valor = 0;
		for (Locacao locacao : alugueis) {
			valor += locacao.filme.valor;
		}
		return valor;
	}

	public Genero generoMaisAlugado() {
		Genero generoMaisAlugado = Genero.values()[0];
		int counter = 0;

		for (Genero genero : Genero.values()) {
			int counterGenero = 0;
			for (Locacao locacao : alugueis) {
				if (locacao.filme.genero == genero) {
					counterGenero++;
				}
			}
			if (counterGenero > counter) {
				counter = counterGenero;
				generoMaisAlugado = genero;
			}
		}

		return generoMaisAlugado;
	}
}
