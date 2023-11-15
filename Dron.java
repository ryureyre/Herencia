package Herencia;

public class Dron implements Movimiento {
	private String Marca;
	
	public Dron(String marca) {
		this.Marca = marca;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	@Override
	public void vuela() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		
	}	
	
}
