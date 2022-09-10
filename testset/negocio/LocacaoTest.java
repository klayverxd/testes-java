package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LocacaoTest {
	Transacao transacao;
	Filme filme;
	Cliente cliente;
	Locacao locacao;

	@Before
	public void setUp() throws Exception {
		transacao = new Transacao();
		locacao = new Locacao();
		filme = new Filme("Java muito feliz, o ódio", Genero.ROMANCE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testClienteNaoAtivo() {
		cliente = new Cliente("Klayver", 13, false);

		try {
			locacao.alugar(cliente, filme);
			transacao.alugueis.add(locacao);
			fail("Cliente inativo");
		} catch (Exception e) {
			assertEquals("Cliente deve estar ativo para alugar um filme", e.getMessage());
		}
	}

	@Test
	public void testDataHoraLocacao() {
		cliente = new Cliente("Klayver", 13, true);

		try {
			locacao.alugar(cliente, filme);
			transacao.alugueis.add(locacao);
			assertNotNull(locacao.data);
			assertNotNull(locacao.hora);
		} catch (Exception e) {
			fail("Cliente inativo");
		}
	}

}
