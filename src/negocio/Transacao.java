package negocio;

import java.util.ArrayList;

public class Transacao {

	protected ArrayList<Locacao> alugueis;
	protected ArrayList generosQtdAluguel;

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
		int qtdDrama = 0;
		int qtdRomance = 0;
		int qtdComedia = 0;

		for (Locacao locacao : alugueis) {
			if (locacao.filme.genero == Genero.DRAMA) {
				qtdDrama++;
			} else if (locacao.filme.genero == Genero.ROMANCE) {
				qtdRomance++;
			} else if (locacao.filme.genero == Genero.COMEDIA) {
				qtdComedia++;
			}
		}

		if (qtdDrama > qtdRomance && qtdDrama > qtdComedia) {
			return Genero.DRAMA;
		} else if (qtdRomance > qtdDrama && qtdRomance > qtdComedia) {
			return Genero.ROMANCE;
		} else {
			return Genero.COMEDIA;
		}
	}
}
