package default_table_model;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import entidades.Pato;

public class Janela extends JFrame {
	
	String[] colNames = new String[] {"id", "nome"};
	
	List<Pato> patosCima = new ArrayList<>();
	DefaultTableModel dtmCima = new DefaultTableModel(colNames, 0);
	JTable tabelaCima = new JTable(dtmCima);
	JScrollPane paneCima = new JScrollPane(tabelaCima);
	
	List<Pato> patosBaixo = new ArrayList<>();
	DefaultTableModel dtmBaixo = new DefaultTableModel(colNames, 0);
	JTable tabelaBaixo = new JTable(dtmBaixo);
	JScrollPane paneBaixo = new JScrollPane(tabelaBaixo);
	
	JButton paraCima = new JButton("^");
	JButton paraBaixo = new JButton("v");
	
	JTextField idField = new JTextField(10);
	JTextField nomeField = new JTextField(30);
	JButton addBotao = new JButton("Add");
	
	public void init() {
		
		setLayout(new BorderLayout());
		
		JPanel panelAdd = new JPanel();
		panelAdd.setLayout(new BoxLayout(panelAdd, BoxLayout.LINE_AXIS));
		panelAdd.add(new JLabel("id: "));
		panelAdd.add(idField);
		panelAdd.add(new JLabel("   nome: "));
		panelAdd.add(nomeField);
		panelAdd.add(addBotao);
		add(panelAdd, BorderLayout.NORTH);
		
		JPanel botoesCimaBaixo = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 2));
		botoesCimaBaixo.add(paraBaixo);
		botoesCimaBaixo.add(paraCima);
		
		JPanel tabelasPane = new JPanel();
		tabelasPane.setLayout(new BoxLayout(tabelasPane, BoxLayout.PAGE_AXIS));
		tabelasPane.add(paneCima);
		tabelasPane.add(botoesCimaBaixo);
		tabelasPane.add(paneBaixo);
		
		add(tabelasPane, BorderLayout.CENTER);
		
		addBotao.addActionListener(new AcaoAdiciona());
		paraBaixo.addActionListener(new AcaoPassarParaBaixo());
		paraCima.addActionListener(new AcaoPassarParaCima());
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void adicionPato(Pato pato) {
		patosCima.add(pato);
		atualizaTabelas();
	}
	
	private void atualizaTabelas() {
		dtmCima.setRowCount(0);
		for(Pato pato: patosCima) {
			dtmCima.addRow(new Object[] {pato.getId(), pato.getNome()});
		}
		dtmBaixo.setRowCount(0);
		for(Pato pato: patosBaixo) {
			dtmBaixo.addRow(new Object[] {pato.getId(), pato.getNome()});
		}
	}
	
	
	class AcaoAdiciona implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String idString = idField.getText().trim();
			String nome = nomeField.getText().trim();
			
			int id;
			try {
				id = Integer.parseInt(idString);
			}catch (Exception ex) {
				System.out.println("Nao foi possivel transformar id entrado em int");
				return;
			}
			
			if(nome.equals("")) return;
			
			patosCima.add(new Pato(id, nome));
			
			atualizaTabelas();
			
		}
		
	}
	
	class AcaoPassarParaBaixo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int[] rowsArray = tabelaCima.getSelectedRows();
			
			Set<Integer> rows = new TreeSet<>();
			
			for(int i: rowsArray) {
				patosBaixo.add(patosCima.get(i));
				rows.add(i);
			}
			
			List<Pato> novoPatosCima = new ArrayList<>();
			for(int i=0; i<patosCima.size(); i++) {
				if(rows.contains(i)) continue;
				novoPatosCima.add(patosCima.get(i));
			}
			patosCima = novoPatosCima;
			
			atualizaTabelas();
			
		}
		
	}
	

	
	class AcaoPassarParaCima implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int[] rowsArray = tabelaBaixo.getSelectedRows();
			
			Set<Integer> rows = new TreeSet<>();
			
			for(int i: rowsArray) {
				patosCima.add(patosBaixo.get(i));
				rows.add(i);
			}
			
			List<Pato> novoPatosBaixo = new ArrayList<>();
			for(int i=0; i<patosBaixo.size(); i++) {
				if(rows.contains(i)) continue;
				novoPatosBaixo.add(patosBaixo.get(i));
			}
			patosBaixo = novoPatosBaixo;
			
			atualizaTabelas();
			
		}
		
	}
	






}
