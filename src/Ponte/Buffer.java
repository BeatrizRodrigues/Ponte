package Ponte;

import java.util.Objects;

public class Buffer {
	String buf[];
	
	Integer frente;
	Integer fim;
	Integer tamMax;
	Integer tamanho;
	
	public Buffer(int tamMax) {
		buf = new String[tamMax];
		this.tamMax = tamMax;
		this.frente = -1;
		this.fim = -1;
		this.tamanho = 0;
	}
	
	public synchronized void adicionarCarro(String prox) throws InterruptedException {
		while(Objects.equals(tamanho, tamMax)) {
			wait();
		}
		
		fim = (fim+1)%tamMax;
		buf[fim] = prox;
		tamanho++;
		
		if(frente == -1) {
			frente = fim;
		}
		
		Thread.sleep(1000);
		notifyAll();
		
	}
	
	public synchronized String moverCarro() throws InterruptedException{
		String aux;
		
		while(tamanho == 0) {
			wait();
		}
		
		aux = buf[frente];
		buf[frente] = null;
		frente = (frente +1)%tamMax;
		tamanho--;
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + " ");
			Thread.sleep(1000);
		}
		
		System.out.println();
		notifyAll();
		return aux;
	}

}
