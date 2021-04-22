package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() {
		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida*/
		
		/*último comando*/
		setVisible(true);/*Tela visivel ao usuário*/
	}

}
