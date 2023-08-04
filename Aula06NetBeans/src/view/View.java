package view;

import entidades.DiaSemana;
import entidades.Perfil;
import java.awt.event.ActionListener;
import java.util.List;

public interface View {
    
    public void mostraPerfis(List<Perfil> perfils);
    
    public String getNomeBusca();
    public DiaSemana getFiltroBusca();
    public void addActionBusca(ActionListener al);
    
    public Perfil getAddPerfil();
    public void addActionAdicionar(ActionListener al);
    
    public void mostraMensagem(String mensagem);
    
    
}
