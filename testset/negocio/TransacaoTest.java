package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TransacaoTest {
	Transacao transacao;

	@Before
	public void setUp() throws Exception {
		transacao = new Transacao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValorLocacaoTotal() {
		Locacao locacao1 = new Locacao();
		Locacao locacao2 = new Locacao();
		Filme filme1 = new Filme("Java", Genero.COMEDIA);
		filme1.setValor(100);

		Filme filme2 = new Filme("JavaScript", Genero.COMEDIA);
		filme2.setValor(50);

		locacao1.alugar(new Cliente("User1", 2, true), filme1);
		locacao2.alugar(new Cliente("User2", 2, true), filme2);

		transacao.alugueis.add(locacao1);
		transacao.alugueis.add(locacao2);
		assertTrue(150 == transacao.valorLocacaoTotal());
	}

	@Test
	public void testGeneroMaisAlugado() {
		Locacao locacao1 = new Locacao();
		Locacao locacao2 = new Locacao();
		Filme filme1 = new Filme("Java", Genero.ROMANCE);
		filme1.setValor(100);

		Filme filme2 = new Filme("JavaScript", Genero.ROMANCE);
		filme2.setValor(50);

		locacao1.alugar(new Cliente("User1", 2, true), filme1);
		locacao2.alugar(new Cliente("User2", 2, true), filme2);

		transacao.alugueis.add(locacao1);
		transacao.alugueis.add(locacao2);

		assertTrue(Genero.ROMANCE == transacao.generoMaisAlugado());
	}
}
