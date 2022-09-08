package negocio;

public class Cliente {

	protected String nome;
	protected Integer id;
	protected Boolean ativo;
	
	public Cliente(String nome, Integer id, Boolean ativo) {
		this.nome = nome;
		this.id = id;
		this.ativo = ativo;
	}
}
