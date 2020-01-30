package visao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);		
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado Swing");
		JProgressBar progressBar = new JProgressBar();
		add(progressBar, BorderLayout.NORTH);
		setVisible(true);
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
}
