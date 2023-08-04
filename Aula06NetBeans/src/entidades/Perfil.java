package entidades;

public class Perfil {
    private String nome;
    private DiaSemana diaSemana;

    public Perfil(String nome, DiaSemana diaSemana) {
        this.nome = nome;
        this.diaSemana = diaSemana;
    }

    public String getNome() {
        return nome;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }
    
}
