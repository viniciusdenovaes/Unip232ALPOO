/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidades.DiaSemana;
import entidades.Perfil;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author vinicius
 */
public class Janela extends javax.swing.JFrame implements View{
    
    DefaultTableModel dtm = new DefaultTableModel(new Object[]{"Nome", "Dia Preferido"}, 0);

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        paneBusca = new javax.swing.JPanel();
        paneBuscaBotoes = new javax.swing.JPanel();
        botaoOk = new javax.swing.JButton();
        filtroBusca = new javax.swing.JComboBox<>();
        fieldBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(dtm);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeAdd = new javax.swing.JTextField();
        diaComboAdd = new javax.swing.JComboBox<>();
        botaoAdd = new javax.swing.JButton();
        labelMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoOk.setText("Busca");
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });

        filtroBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo" }));

        javax.swing.GroupLayout paneBuscaBotoesLayout = new javax.swing.GroupLayout(paneBuscaBotoes);
        paneBuscaBotoes.setLayout(paneBuscaBotoesLayout);
        paneBuscaBotoesLayout.setHorizontalGroup(
            paneBuscaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBuscaBotoesLayout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filtroBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paneBuscaBotoesLayout.setVerticalGroup(
            paneBuscaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBuscaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botaoOk, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addComponent(filtroBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable1.setModel(dtm);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout paneBuscaLayout = new javax.swing.GroupLayout(paneBusca);
        paneBusca.setLayout(paneBuscaLayout);
        paneBuscaLayout.setHorizontalGroup(
            paneBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(paneBuscaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneBuscaLayout.setVerticalGroup(
            paneBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBuscaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneBuscaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPane.addTab("Buscar", paneBusca);

        jLabel1.setText("Nome:");

        jLabel2.setText("Dia:");

        nomeAdd.setText("nome");
        nomeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAddActionPerformed(evt);
            }
        });

        diaComboAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo" }));
        diaComboAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaComboAddActionPerformed(evt);
            }
        });

        botaoAdd.setText("Adicionar");
        botaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddActionPerformed(evt);
            }
        });

        labelMensagem.setText("Mensagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botaoAdd)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(diaComboAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelMensagem))
                .addContainerGap(815, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(diaComboAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(botaoAdd)
                .addGap(63, 63, 63)
                .addComponent(labelMensagem)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        tabPane.addTab("Adicionar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoOkActionPerformed

    private void nomeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAddActionPerformed

    private void diaComboAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaComboAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaComboAddActionPerformed

    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoOk;
    private javax.swing.JComboBox<String> diaComboAdd;
    private javax.swing.JTextField fieldBusca;
    private javax.swing.JComboBox<String> filtroBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelMensagem;
    private javax.swing.JTextField nomeAdd;
    private javax.swing.JPanel paneBusca;
    private javax.swing.JPanel paneBuscaBotoes;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostraPerfis(List<Perfil> perfils) {
        dtm.setRowCount(0);
        for(Perfil p: perfils){
            dtm.addRow(new Object[]{p.getNome(), p.getDiaSemana()});
            System.out.println(p.getNome() + " " + p.getDiaSemana());
        }
        
    }

    @Override
    public String getNomeBusca() {
        return fieldBusca.getText();
    }
    
    static private DiaSemana stringToDiaSemana(String diaString){
        if(diaString==null) return null;
        DiaSemana dia=null;
        switch(diaString){
            case "Segunda": dia=DiaSemana.SEGUNDA; break;
            case "Terca":   dia=DiaSemana.TERCA;   break;
            case "Quarta":  dia=DiaSemana.QUARTA;  break;
            case "Quinta":  dia=DiaSemana.QUINTA;  break;
            case "Sexta":   dia=DiaSemana.SEXTA;   break;
            case "Sabado":  dia=DiaSemana.SABADO;  break;
            case "Domingo": dia=DiaSemana.DOMINGO; break;
        }
        return dia;
    }

    @Override
    public DiaSemana getFiltroBusca() {
        String diaString = (String)filtroBusca.getSelectedItem();
        if(diaString=="Nenhum") return null;
        return stringToDiaSemana(diaString);
    }

    @Override
    public void addActionBusca(ActionListener al) {
        botaoOk.addActionListener(al);
    }

    @Override
    public Perfil getAddPerfil() {
        String diaString = (String)diaComboAdd.getSelectedItem();
        DiaSemana dia = stringToDiaSemana(diaString);
        String nome = nomeAdd.getText();
        return new Perfil(nome, dia);
    }

    @Override
    public void addActionAdicionar(ActionListener al) {
        botaoAdd.addActionListener(al);
    }

    @Override
    public void mostraMensagem(String mensagem) {
        labelMensagem.setText(mensagem);
    }
}
