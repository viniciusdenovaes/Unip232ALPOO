package model.dao;

import entidades.DiaSemana;
import entidades.Perfil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DaoNotPersistent implements Dao{
    Map<String, Perfil> perfis = new TreeMap<>();

    @Override
    public boolean addEntrada(Perfil perfil) {
        if(perfis.containsKey(perfil.getNome())){
            return false;
        }
        
        perfis.put(perfil.getNome(), perfil);
        return true;
    }

    @Override
    public List<Perfil> busca(String nome) {
        return busca(nome, null);
    }

    @Override
    public List<Perfil> busca(String nome, DiaSemana diaSemana) {
        List<Perfil> resultado = new ArrayList<>();
        for(Perfil p: perfis.values()){
            if(diaSemana!=null)
                if(p.getDiaSemana()!=diaSemana)
                    continue;
            System.out.println("verificando " + p.getNome() + " resultado");
            System.out.println(p.getNome().toLowerCase() + ".contains("+nome.toLowerCase()+")");
            System.out.println(p.getNome().toLowerCase().contains(nome.toLowerCase()));
            if(p.getNome().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("adicionando " + p.getNome() + " resultado");
                resultado.add(p);
            }
        }
        return resultado;
    }
    
}
