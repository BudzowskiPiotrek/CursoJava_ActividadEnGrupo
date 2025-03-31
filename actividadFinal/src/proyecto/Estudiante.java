package proyecto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Clase que representa a un estudiante, extendiendo la clase Personal.
 * 
 * @author [Piotrek Budzowski]
 */
public class Estudiante extends Personal {
	/** Mapa que almacena las asignaturas del estudiante y su estado. */
	private Map<Asignatura, EstadoAsignatura> asignaturas;

	/**
	 * Constructor para crear un objeto Estudiante.
	 *
	 * @param nombre Nombre del estudiante.
	 */
	public Estudiante(String nombre) {
		super(nombre);
		this.asignaturas = new HashMap<>();
	}

	/**
	 * Obtiene el mapa de asignaturas del estudiante.
	 *
	 * @return El mapa de asignaturas del estudiante.
	 */
	public Map<Asignatura, EstadoAsignatura> getAsignatura() {
		return asignaturas;
	}

	/**
	 * Establece el mapa de asignaturas del estudiante.
	 *
	 * @param asignatura El nuevo mapa de asignaturas del estudiante.
	 */
	public void setAsignatura(Map<Asignatura, EstadoAsignatura> asignatura) {
		this.asignaturas = asignatura;
	}

	/**
	 * Añade una asignatura al estudiante con el estado especificado.
	 *
	 * @param asignatura La asignatura que se va a añadir.
	 * @param estado     El estado de la asignatura (SUPERADO, CURSADO, ABANDONADO).
	 */
	public boolean anadirSignatura(Asignatura asignatura, EstadoAsignatura estado) {
		if (!asignaturas.containsKey(asignatura)) {
			asignaturas.put(asignatura, estado);
			return true;
		}
		return false;
	}

	/**
	 * Elimina una asignatura del estudiante por su nombre.
	 *
	 * @param nombre El nombre de la asignatura a eliminar.
	 * @return true si la asignatura se eliminó con éxito, false si no se encontró.
	 */
	public boolean borrarAsignatura(String nombre) {
		Iterator<Map.Entry<Asignatura, EstadoAsignatura>> iterator = asignaturas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Asignatura, EstadoAsignatura> entry = iterator.next();
			if (entry.getKey().getNombre().equalsIgnoreCase(nombre)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	/**
	 * Muestra la información del estudiante y sus asignaturas.
	 */
	public void mostrarAsignaturas() {
		if (!asignaturas.isEmpty()) {
			System.out.println("************");
			System.out.println("Nombre: " + nombre);
			System.out.println("Asignaturas");
			for (Map.Entry<Asignatura, EstadoAsignatura> entry : asignaturas.entrySet()) {
				System.out.println(entry.getKey() + " - Estado Actual: " + entry.getValue());
			}
		}
	}
}
