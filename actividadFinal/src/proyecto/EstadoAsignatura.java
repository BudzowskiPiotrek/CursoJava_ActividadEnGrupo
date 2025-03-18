package proyecto;

import java.util.Iterator;

public enum EstadoAsignatura {
	SUPERADO, CURSADO, ABANDONADO

	
	public static void eliminarEstudiante() {
		System.out.println("Introduce el nombre del estudiante");
		String nombre = letra.nextLine().toUpperCase();
				
		Iterator<Persona> iterator = persona.iterator();
		while (iterator.hasNext()) {
			Persona persona = iterator.next();
			if (persona.getNombre().equalsIgnoreCase(nombre)) {
				iterator.remove();
				System.out.println("Borrado con exito");
				return;
			}
		}
		System.out.println("No se encontro al estudiante");
		
	}
}
