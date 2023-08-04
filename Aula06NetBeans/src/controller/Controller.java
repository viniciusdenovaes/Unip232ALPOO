package controller;

import entidades.DiaSemana;
import entidades.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.dao.Dao;
import view.View;

public class Controller {
    
    Dao model;
    View view;
    
    public Controller(Dao aModel, View aView){
        this.model = aModel;
        this.view = aView;
    }
    
    public void init(){
        view.addActionBusca(new AcaoBuscar());
        view.addActionAdicionar(new AcaoAdiciona());
    }
    
    class AcaoBuscar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNomeBusca();
            DiaSemana dia = view.getFiltroBusca();
            
            List<Perfil> perfils;
            if(dia==null){
                perfils = model.busca(nome);
            }else{
                perfils = model.busca(nome, dia);
            }
            
            view.mostraPerfis(perfils);
        }
    }
    
    class AcaoAdiciona implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Perfil perfil = view.getAddPerfil();
            boolean result = model.addEntrada(perfil);
            if(!result){
                String mensagem = "Nao foi possivel adicionar o perfil, nome "+perfil.getNome()+" ja existe";
                view.mostraMensagem(mensagem);
            }
        }
        
    }
    
}
