package Ponte;

public class Veiculo extends Thread{
	Ponte ponte;
	String tipo;
	
	public Veiculo(Ponte fila, String tipo) {
		this.ponte = fila;
		this.tipo = tipo;
	}
	
	@Override
	public void run() {
		switch (tipo) {
		case "Ambulancia":
			this.setPriority(10);
			break;
		case "Policia":
			this.setPriority(9);
			break;
		case"Comum":
			this.setPriority(5);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		try {
			ponte.adicionarCarro(tipo);
		} catch (InterruptedException e) {}
		
	}
}
