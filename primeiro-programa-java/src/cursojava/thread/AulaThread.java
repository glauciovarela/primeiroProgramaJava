package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void rum() {/*Executa o que queremos*/
				/*Código da rotina */
				
				/*Rotina em pararelo*/
				for (int pos = 0; pos < 10; pos++) {
					
					/*Execute este envio com um tempo de parada*/
					System.out.println("Executando alguma rotina, por exemplo envio de email");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				/*Fim do código em paralelo*/
				
			};
			
		}.start();/*Aciona a thread*/
		
				
		/*Código do sistema continua o fluxo */
		System.out.println("Chegou ao fim o código de teste da THREAD");
		/*Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "O Sistema continua para o usuário");
	}
}

