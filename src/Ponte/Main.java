package Ponte;

public class Main {
	
	public static void main(String[] args) {
		Buffer buffer = new Buffer(5);
		
		Veiculo veiculo1 = new Veiculo(buffer, "comum");
		Veiculo veiculo2 = new Veiculo(buffer, "Ambulancia");
		Veiculo veiculo3 = new Veiculo(buffer, "comum");
		Veiculo veiculo4 = new Veiculo(buffer, "Policia");
		Veiculo veiculo5 = new Veiculo(buffer, "Ambulancia");
		
		Ponte ponte = new Ponte(buffer);
	
		veiculo1.start();
		veiculo2.start();
		veiculo3.start();
		veiculo4.start();
		veiculo5.start();
		
		ponte.start();
	}
}
