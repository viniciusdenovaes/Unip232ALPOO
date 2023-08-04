/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import entidades.DiaSemana;
import entidades.Perfil;
import java.util.List;

/**
 *
 * @author vinicius
 */
public interface Dao {
    
    public boolean addEntrada(Perfil perfil);
    public List<Perfil> busca(String nome);
    public List<Perfil> busca(String nome, DiaSemana diaSemana);
    
}
