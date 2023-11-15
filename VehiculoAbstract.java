package Herencia;

public abstract class VehiculoAbstract {
	private String Marca;
	private String Modelo;
	
	public VehiculoAbstract(String marca, String modelo)
	{
		this.Marca = marca; 
		this.Modelo = modelo;
	}
	
	public void setMarca(String marca)
	{
		this.Marca = marca;
	}
	
	public String getMarca() {
		return this.Marca;
	}
	
	public void setModelo(String modelo)
	{
		this.Modelo = modelo;
	}
	
	public String getModelo() {
		return this.Modelo;
	}
	
	public abstract void Arrancar();
	public abstract void Acelerar();
	public abstract void Frenar();
	public abstract void Apagar();
	
	public void MostrarDatos() {
		System.out.println("Modelo: " + getModelo());
		System.out.println("Marca:" + getMarca());		
	}
}
