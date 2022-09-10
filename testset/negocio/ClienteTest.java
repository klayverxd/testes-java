package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFilmeFavorito() {
		Cliente cliente = new Cliente("User1", 2, true);
		Filme filme1 = new Filme("Java", Genero.ROMANCE);

		cliente.setFavoritos(filme1);

		assertTrue(filme1 == cliente.getFavorito(0));
	}

}
