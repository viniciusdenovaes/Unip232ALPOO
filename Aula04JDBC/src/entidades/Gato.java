package entidades;

public class Gato {
	
	int id;
	String nome;
	
	public Gato(int aId, String aNome) {
		this.id = aId;
		this.nome = aNome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Gato(" + id + "): " + nome + "";
	}
	


}
