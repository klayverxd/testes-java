package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilmeTest {

	Filme filme;

	@Before
	public void setUp() throws Exception {
		System.out.println("Antes");
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testFilme() {
		filme = new Filme("Java", Genero.DRAMA);
		assertEquals("Java", filme.nome);
	}

	@Test
	public void testSetValor() {
		filme = new Filme("Java", Genero.ROMANCE);
		filme.setValor(10.0);
		assertEquals(filme.valor, 9.0, 0.01);
	}

}
