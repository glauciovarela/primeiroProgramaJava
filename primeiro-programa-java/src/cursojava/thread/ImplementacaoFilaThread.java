package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;



public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
			new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
    }

	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) {
		
		while (iteracao.hasNext()) {
			
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
			
			
			System.out.println("----------------------------------");
			
			System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			
			System.out.println("----------------------------------");
			
			iteracao.remove();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
		
	}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
     }
}
