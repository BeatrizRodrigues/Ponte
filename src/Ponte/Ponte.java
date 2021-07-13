package Ponte;

import java.util.ArrayList;
import java.util.Objects;

public class Ponte extends Thread{
	ArrayList<String> buf = new ArrayList<String>();
	
	//String buf[];	
	Integer frente;
	Integer fim;
	//Integer tamMax;
	//Integer tamanho;
	
	
	public Ponte() {
		frente = -1;
		fim = -1;
	}
	
	public synchronized void adicionarCarro(String prox) throws InterruptedException {
				
		fim = (fim+1);
		buf.add(prox);
		
		if(frente == -1) {
			frente = fim;
		}
		
		Thread.sleep(1000);
		notifyAll();
		
	}
	
	public synchronized String moverCarro() throws InterruptedException{
		String aux;
		
		while(buf.isEmpty()) {
			wait();
		}
		
		aux = buf.get(frente);
		buf.set(frente, null);
		frente++;
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			Thread.sleep(1000);
		}
		
		System.out.println();
		notifyAll();
		return aux;
	}
	
	@Override
	public void run() {
		String aux;
		while(true) {
			try {
				aux = moverCarro();
				System.out.println("Atravessou: " + aux);
			} catch (InterruptedException e) {}
		}
	}
	
	
}
