package calculadora_grid;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class CalculadoraGrid extends JFrame{
	
	String primeiroNumeroEscrito = "";
	String segundoNumeroEscrito = "";
	
	Operacao operacao;
	String operacaoEscrito = "";
	
	JLabel visorPergunta = new JLabel(" ");
	JLabel visorResposta = new JLabel(" ");
	
	boolean editandoPrimeiroNumero = true;
	
	List<JButton> botoesNumero = new ArrayList<>();
	List<JButton> botoesOperacao = new ArrayList<>();
	
	JButton botaoIgual = new JButton("=");
	
	public void init() {
		criaElementos();
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void criaElementos() {
		
		for(int i=0; i<=9; i++) {
			String digitoEscrito = Integer.toString(i);
			JButton botao = new JButton(digitoEscrito);
			botoesNumero.add(botao);
			botao.addActionListener(new AcaoNumero(digitoEscrito));
		}
		
		JButton botaoSoma = criaBotaoOperacao(Operacao.SOMA);
		JButton botaoSubt = criaBotaoOperacao(Operacao.SUBTRACAO);
		JButton botaoMult = criaBotaoOperacao(Operacao.MULTIPLICACAO);
		JButton botaoDivi = criaBotaoOperacao(Operacao.DIVISAO);
		
		botoesOperacao.add(botaoSoma);
		botoesOperacao.add(botaoSubt);
		botoesOperacao.add(botaoMult);
		botoesOperacao.add(botaoDivi);
		
		botaoIgual.addActionListener(new AcaoResposta());
		
		JButton botaoDummy = new JButton();
		botaoDummy.setEnabled(false);
		
		setLayout(new BorderLayout(20, 20));
		
		JPanel painelVisores = new JPanel();
		painelVisores.setLayout(
				new BoxLayout(
						painelVisores, 
						BoxLayout.PAGE_AXIS));
		
		JPanel painelVisorPergunta = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		painelVisorPergunta.add(visorPergunta);
		painelVisores.add(painelVisorPergunta);
		
		JPanel painelVisorResposta = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		painelVisorResposta.add(visorResposta);
		painelVisores.add(painelVisorResposta);
		
		painelVisorPergunta.setBackground(Color.CYAN);
		painelVisorResposta.setBackground(Color.YELLOW);
		
		add(painelVisores, BorderLayout.NORTH);
		
		JPanel painelBotoes = new JPanel(new GridLayout(4, 4, 2, 2));
		painelBotoes.setPreferredSize(new Dimension(250, 250));
		painelBotoes.add(botoesNumero.get(1));
		painelBotoes.add(botoesNumero.get(2));
		painelBotoes.add(botoesNumero.get(3));
		painelBotoes.add(botaoSoma);
		painelBotoes.add(botoesNumero.get(4));
		painelBotoes.add(botoesNumero.get(5));
		painelBotoes.add(botoesNumero.get(6));
		painelBotoes.add(botaoSubt);
		painelBotoes.add(botoesNumero.get(7));
		painelBotoes.add(botoesNumero.get(8));
		painelBotoes.add(botoesNumero.get(9));
		painelBotoes.add(botaoMult);
		painelBotoes.add(botaoDummy);
		painelBotoes.add(botoesNumero.get(0));
		painelBotoes.add(botaoIgual);
		painelBotoes.add(botaoDivi);
		
		add(painelBotoes, BorderLayout.CENTER);
		
		
		
	}
	
	JButton criaBotaoOperacao(Operacao o) {
		JButton b = new JButton(o.simbolo); 
		b.addActionListener(new AcaoOperacao(o)); 
		return b; 
	}
	
	void atualizaVisorPergunta() {
		String perguntaEscrita = 
				this.primeiroNumeroEscrito + 
				this.operacaoEscrito + 
				this.segundoNumeroEscrito;
		this.visorPergunta.setText(perguntaEscrita);
	}
	
	class AcaoNumero implements ActionListener{
		String digito;
		public AcaoNumero(String aDigito) {
			this.digito = aDigito;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(editandoPrimeiroNumero) {
				primeiroNumeroEscrito = primeiroNumeroEscrito + this.digito; 
			}
			else {
				segundoNumeroEscrito = segundoNumeroEscrito + this.digito; 
			}
			atualizaVisorPergunta();
		}
	}
	
	class AcaoOperacao implements ActionListener{
		Operacao operacao;
		public AcaoOperacao(Operacao op) {
			this.operacao = op;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			for(JButton b: botoesOperacao) {
				b.setEnabled(false);
			}
			
			editandoPrimeiroNumero = false;
			
			CalculadoraGrid.this.operacao = this.operacao;
			operacaoEscrito = this.operacao.simbolo;
			
			atualizaVisorPergunta();
			
		}
		
	}
	
	class AcaoResposta implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for(JButton b: botoesNumero) {
				b.setEnabled(false);
			}
			int primeiroNumero = Integer.parseInt(primeiroNumeroEscrito);
			int segundoNumero = Integer.parseInt(segundoNumeroEscrito);
			
			if(segundoNumero==0 && operacao==Operacao.DIVISAO) {
				visorResposta.setText("Erro: divisao por Zero");
			}
			else {
				int resposta = operacao.fazCalculo(primeiroNumero, segundoNumero);
				visorResposta.setText(Integer.toString(resposta));
			}
			
			botaoIgual.setEnabled(false);
			
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	new CalculadoraGrid().init();
            }});
	}

}




