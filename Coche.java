package Herencia;

public class Coche extends VehiculoAbstract{
	private int Puertas;
	
	public Coche(String marca, String modelo, int puertas) {
		super(marca, modelo);
		this.Puertas = puertas;			
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Arrancar() {
		// TODO Auto-generated method stub
		System.out.println("El usuario inserto la llave y prendio el carro");
		System.out.println("El carro arranca...");
	
	}

	@Override
	public void Acelerar() {
		// TODO Auto-generated method stub
		System.out.println("El carro acelera...");
				
	}

	@Override
	public void Frenar() {
		// TODO Auto-generated method stub
		System.out.println("El carro frena...");
	} 

	@Override
	public void Apagar() {
		// TODO Auto-generated method stub
		System.out.println("El carro se apaga...");
	}

	public void MostrarDatos() {
		super.MostrarDatos();
		System.out.println("De " + this.Puertas + " puertas.");
	}
}
