package Ponte;

//import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		//ArrayList<Veiculo> fila = new ArrayList<>();
		
		Ponte ponte = new Ponte();
		
		Veiculo veiculo1 = new Veiculo(ponte, "Comum");
		Veiculo veiculo2 = new Veiculo(ponte, "Ambulancia");
		Veiculo veiculo3 = new Veiculo(ponte, "Comum");
		Veiculo veiculo4 = new Veiculo(ponte, "Policia");
		Veiculo veiculo5 = new Veiculo(ponte, "Ambulancia");
		Veiculo veiculo6 = new Veiculo(ponte, "Policia");
		
		ponte.start();
		veiculo1.start();
		veiculo2.start();
		veiculo3.start();
		veiculo4.start();
		veiculo5.start();
		veiculo6.start();
		
	}
}
