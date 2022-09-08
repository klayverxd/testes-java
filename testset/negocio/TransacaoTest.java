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
	public void valorLocacaoTotalTest() {
		Locacao locacao = new Locacao();
		Filme filme1 = new Filme("Java", Genero.ROMANCE);
		filme1.valor = 100;

		Filme filme2 = new Filme("JavaScript", Genero.ROMANCE);
		filme2.valor = 50;

		locacao.alugar(new Cliente("User1", 2, true), filme1);
		locacao.alugar(new Cliente("User2", 2, true), filme2);

		transacao.alugueis.add(locacao);
		assertTrue(50 == transacao.valorLocacaoTotal());
	}
}
