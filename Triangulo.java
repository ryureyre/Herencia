package Herencia;

public class Triangulo extends FiguraGeometrica implements Dibujable {
	  private float Base = 0f;
	    private float Altura = 0f;

	    public Triangulo(){
	        super();
	        this.Base = 0f;
	        this.Altura = 0f;
	    }
	    public Triangulo(String color, String nombre, float base, float altura){
	        super(color, nombre);
	        this.Base = base;
	        this.Altura = altura;
	    }

	    @Override
	    public float CalcularArea(float base, float altura) {
	        float Area = (base * altura)/2;
	        return Area; 
	    }

	    public void MostrarDatos(){
	        System.out.println("\nFigura: " + this.Nombre + 
	                           "\nColor: " + this.Color + 
	                           "\nArea = " + CalcularArea(Base, Altura));
	    }
		@Override
		public void Dibujar() {
			// TODO Auto-generated method stub
			System.out.println("Dibujando circulo...");
		}
}
