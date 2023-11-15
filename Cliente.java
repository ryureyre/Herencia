package Herencia;

public class Cliente extends PersonaAbs {
	private String NombreEmpresa;
	private String TelefonoContacto;
	
	public Cliente(String nombre, int edad, String nombreEmpresa, String telefono) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.NombreEmpresa = nombreEmpresa;
		this.TelefonoContacto = telefono;
	}

	@Override
	public void RealizarActividad() {
		// TODO Auto-generated method stub
		System.out.println("Compra cosas");
	}
	
	public void mostrar() {
		super.Mostrar();
		System.out.println("Empresa: " + this.NombreEmpresa 
						+ " Telefono: " + this.TelefonoContacto);
	}
	
	
	

}
