package dao.database_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import entidades.Gato;

public class DaoDatabase implements Dao {
	
	static private String USER = "vinicius";
	static private String PASS = "123456";
	static private String DATABASE = "veterinario22";
	static private String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
	
	static void testaConnection() {
		
		try (Connection c = DriverManager.getConnection(URL, USER, PASS)){
			System.out.println("Conexao estabelecida");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Gato> getTodosGatos() {
		
		List<Gato> gatos = new ArrayList<>();
		
		final String query = "SELECT * FROM Gatos;";
		try (Connection c = DriverManager.getConnection(URL, USER, PASS)){
			
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				Gato gato = new Gato(id, nome);
				gatos.add(gato);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return gatos;
	}

	@Override
	public void addGato(Gato gato) {
		
		final String query = "INSERT INTO Gatos VALUES (?, ?)";
		
		try (Connection c = DriverManager.getConnection(URL, USER, PASS)){
			
			PreparedStatement pstm = c.prepareStatement(query);
			
			pstm.setInt(1, gato.getId());
			pstm.setString(2, gato.getNome());
			
			int result = pstm.executeUpdate();
			
			System.out.println("Resultado de adicionar gato " + gato + ": " + result);
			 
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Gato> buscaGato(String nomeKey) {
		
		List<Gato> gatos = new ArrayList<>();
		
		final String query = "SELECT * FROM Gatos WHERE LOWER(nome) LIKE LOWER(?);";
		try (Connection c = DriverManager.getConnection(URL, USER, PASS)){
			
			PreparedStatement pstm = c.prepareStatement(query);
			
			pstm.setString(1, "%" + nomeKey + "%");
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				Gato gato = new Gato(id, nome);
				gatos.add(gato);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return gatos;
	}
	
	

}




