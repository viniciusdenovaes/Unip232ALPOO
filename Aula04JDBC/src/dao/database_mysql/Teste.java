package dao.database_mysql;

import java.util.List;

import dao.Dao;
import entidades.Gato;

public class Teste {
	
	public static void main(String[] args) {
		DaoDatabase.testaConnection();
		
		Dao dao = new DaoDatabase();
		
		List<Gato> patos = dao.getTodosGatos();
		
		for(Gato pato: patos) {
			System.out.println(pato);
		}
		
		
		patos = dao.buscaGato("al");
		
		System.out.println();
		for(Gato pato: patos) {
			System.out.println(pato);
		}
		
		// dao.addGato(new Gato(22201, "Gato Aranha"));
		
		patos = dao.buscaGato("aRANHA");
		
		System.out.println();
		for(Gato pato: patos) {
			System.out.println(pato);
		}
		
		
		
		
	}

}
