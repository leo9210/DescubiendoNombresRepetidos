import java.util.ArrayList;

public class Persona implements Comparable{
	private String nombre;
	private int cantidadApariciones;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.cantidadApariciones = 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadApariciones() {
		return cantidadApariciones;
	}

	public void setCantidadApariciones(int cantidadApariciones) {
		this.cantidadApariciones = cantidadApariciones;
	}

	public Persona(String nombre,int cantidadVeces) {
		this.nombre = nombre;
		this.cantidadApariciones = cantidadVeces;
	}

	public int buscarme(ArrayList<Persona> arrayPersonas) {
		for (int i = 0;i<arrayPersonas.size();i++) {
			if (this.nombre.equals(arrayPersonas.get(i).nombre))
				cantidadApariciones++;
		}
		return this.cantidadApariciones;
	}

	@Override
	public String toString() {
		return nombre +" " + cantidadApariciones;
	}

	@Override
	public int compareTo(Object o) {
		Persona p1 = (Persona) o;
		if (this.cantidadApariciones > p1.cantidadApariciones)
			return -1;
		if (this.cantidadApariciones > p1.cantidadApariciones)
			return 1;
		return 0;
	}
	
	
}
