package Herencia;

public class Moto extends VehiculoAbstract {

	public Moto(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Arrancar() {
		// TODO Auto-generated method stub
		System.out.println("La moto arranca...");
	}

	@Override
	public void Acelerar() {
		// TODO Auto-generated method stub
		System.out.println("La moto acelerar...");
	}

	@Override
	public void Frenar() {
		// TODO Auto-generated method stub
		System.out.println("La moto frena...");
	}

	@Override
	public void Apagar() {
		// TODO Auto-generated method stub
		System.out.println("La moto se apaga...");
	}
	
	public void MostrarDatos() {
		System.out.println("Modelo:" + super.getModelo());
		System.out.println("Marca:" + super.getMarca());
	}

}
