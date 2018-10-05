import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("nombres.in"));
		int cantidadChicos = sc.nextInt();
		int cantidadNombresFrecuentes = sc.nextInt();
		sc.nextLine();
		ArrayList<Persona> arrayPersonas = new ArrayList<>();
		HashMap<String, Persona> map = new HashMap<>();
		for (int i = 0; i<cantidadChicos;i++) {
			arrayPersonas.add(new Persona(sc.nextLine()));
			map.put(arrayPersonas.get(i).getNombre(), arrayPersonas.get(i));
		}
	    String clave;
	    Iterator<String> nombres = map.keySet().iterator();
	    while(nombres.hasNext()){
	        clave = nombres.next();
	        map.get(clave).buscarme(arrayPersonas);
	    }   
		Collections.sort(arrayPersonas, new OrdenarPorAparicion());
		for (int i = 0;i<cantidadNombresFrecuentes;i++) {
			System.out.println(arrayPersonas.get(i));
		}
		sc.close();
		
	}

}
