package negocio;

public class Filme {
	protected String nome;
	protected String id;
	protected double valor;
	protected Genero genero;

	public Filme(String nome, Genero genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public void setValor(double valor) {
		// função de desconto para categoria de ROMANCE
		if (this.genero == Genero.ROMANCE) {
			this.valor = valor * 0.9;
			System.out.println("Desconto de 10% para filme de romance");
		} else {
			this.valor = valor;
		}
	}
}
