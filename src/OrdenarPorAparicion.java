import java.util.Comparator;

public class OrdenarPorAparicion implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return p2.getCantidadApariciones() - p1.getCantidadApariciones();
	}

}
