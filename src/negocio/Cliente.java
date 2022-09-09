package negocio;

import java.util.ArrayList;

public class Cliente {

	protected String nome;
	protected Integer id;
	protected Boolean ativo;
	protected ArrayList<Filme> favoritos;
	
	public Cliente(String nome, Integer id, Boolean ativo) {
		this.nome = nome;
		this.id = id;
		this.ativo = ativo;
		this.favoritos = new ArrayList<Filme>();
	}
	
	public void setFavoritos(Filme filme) {
		this.favoritos.add(filme);
	}
	
	public Filme getFavorito(Integer posicao) {
		return this.favoritos.get(posicao);
	}
}
