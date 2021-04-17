package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

		String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter?");

		
		double[] notas = new double[Integer.parseInt(posicoes)];	

		
		for (int pos = 0; pos < notas.length; pos ++ ) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posicao = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
/* teste */
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Notas " + (pos +1) + " é = " + notas[pos]);

		}

		/*System.out.println("Nota 1 = " + notas[0]);
	System.out.println("Nota 2 = " + notas[1]);
	System.out.println("Nota 3 = " + notas[2]);
	System.out.println("Nota 4 = " + notas[3]);*/
	}

}
