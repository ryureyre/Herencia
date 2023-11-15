package Herencia;

public class Trabajador extends PersonaAbs implements EstudianteTrabajador{
	private String Puesto;
	private double sueldo_bruto;
	private Empresa empresaEmpleado;
	
	public Trabajador(String nombre, int edad, String puesto) {
		super(nombre, edad);
		this.Puesto = puesto;
		this.sueldo_bruto = 0;
		// TODO Auto-generated constructor stub
	}
	
	public Trabajador(String nombre, int edad, String puesto, double SueldoBruto, String Empresa) {
		super(nombre, edad);
		this.Puesto = puesto;
		this.sueldo_bruto = SueldoBruto;
		empresaEmpleado = new Empresa(Empresa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RealizarActividad() {
		// TODO Auto-generated method stub
		System.out.println("El trabajador entrega su proyecto en tiempo y forma a los clientes");
	}

	@Override
	public void Sueldo() {
		// TODO Auto-generated method stub
		System.out.println("Es quincena, día de pago");
	}
	
	public double CalcularSalarioNeto() {
		return this.sueldo_bruto - (this.sueldo_bruto * 0.16);
	}
	
	public void Mostrar() {
		super.Mostrar();
		System.out.println("Puesto:" + this.Puesto + "\nEmpresa: " +  this.empresaEmpleado.getNombre());
		System.out.println("Sueldo Bruto: " + this.sueldo_bruto + "\nSueldo Neto: " + this.CalcularSalarioNeto());
	}

}
