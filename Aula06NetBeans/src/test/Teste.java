package test;

import view.Janela;
import view.View;
import controller.Controller;
import model.dao.Dao;
import model.dao.DaoNotPersistent;


public class Teste {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Janela j = new Janela();
                j.setVisible(true);
                Dao model = new DaoNotPersistent();
                new Controller(model, j).init();
            }
        });
        
    }
    
}
