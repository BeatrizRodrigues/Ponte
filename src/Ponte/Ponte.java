package Ponte;

public class Ponte extends Thread{
	Buffer buffer;
	
	public Ponte(Buffer carros) {
		this.buffer = carros;
	}
	
	@Override
	public void run() {
		String aux;
		for (int i=0; i<5; i++) {
			try {
				aux = buffer.moverCarro();
				System.out.println("Atravessou: " + aux);
			} catch (InterruptedException e) {}
		}
	}
	
	
}
