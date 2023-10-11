package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import entidade.Pato;

public class ViewJanela extends JFrame implements View{
	
	JTabbedPane tabedPane = new JTabbedPane();
	
	 JPanel createDummyPanel(String mensagem) {
		JPanel panel = new JPanel(false);
		JLabel filler = new JLabel(mensagem);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JButton(mensagem));
        panel.add(new JButton(mensagem));
        panel.add(new JButton(mensagem));
        panel.add(filler);
		return panel;
	}
	
	public void init() {
		
		createDummyPanel("Dummy");
		
		tabedPane.addTab("dummy 1", createDummyPanel("Dummy 1"));
		tabedPane.addTab("dummy 2", createDummyPanel("Dummy 2"));
		tabedPane.addTab("dummy 3", createDummyPanel("Dummy 3"));
		
		add(tabedPane);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	@Override
	public void mostrarPatos(List<Pato> patos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBuscaPatoByNameListener(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pegaNomePatoBuscaByNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBuscaPatoByIdListener(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pegaIdPatoBuscaById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addApagaPatoByIdListener(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pegaIdApagaPatoById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAdicionaPatoListener(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pegaNomeAddPato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pegaIdAddPato() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		new ViewJanela().init();
	}

}
