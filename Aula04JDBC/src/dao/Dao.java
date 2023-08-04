package dao;

import java.util.List;

import entidades.Gato;

public interface Dao {
	
	public void addGato(Gato pato);
	public List<Gato> getTodosGatos();
	public List<Gato> buscaGato(String nome);

}
