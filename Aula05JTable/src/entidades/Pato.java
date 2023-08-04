package entidades;

public class Pato {
	
	private int id;
	private String nome;
	
	public Pato(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pato [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
