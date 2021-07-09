package Ponte;

public class Veiculo extends Thread{
	Buffer buffer;
	String tipo;
	Veiculo vei;
	
	public Veiculo(Buffer carros, String tipo) {
		this.buffer = carros;
		this.tipo = tipo;
	}
	
	@Override
	public void run() {
		switch (tipo) {
		case "Ambulancia":
			this.setPriority(MAX_PRIORITY);
			break;
		case "Policia":
			this.setPriority(9);
			break;
		case"comum":
			this.setPriority(NORM_PRIORITY);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		try {
			buffer.adicionarCarro(tipo);
		} catch (InterruptedException e) {}
		
	}
}
