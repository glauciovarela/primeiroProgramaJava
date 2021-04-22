package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNFC = new Thread(thread2);
		threadNFC.start();
		
		
		System.out.println("Chegou ao fim o código de teste da THREAD");
		
		JOptionPane.showMessageDialog(null, "O Sistema continua para o usuário");
	
	}
		
	private static Runnable thread2 = new Runnable() {
			
		@Override
		public void run() {
			
			for (int pos = 0; pos < 10; pos++) {
				
			System.out.println("Executando alguma rotina, por exemplo E-mail");
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

};
	
		private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			for (int pos = 0; pos < 10; pos ++) {
				
				System.out.println("Executando alguma rotina, E-mail");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
}

