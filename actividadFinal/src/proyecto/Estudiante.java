package proyecto;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;

public class Estudiante extends Persona {
	private Map<Asignatura, EstadoAsignatura> asignatura;

	public Estudiante(String nombre) {
		super(nombre);
		this.asignatura = new HashMap<>();
	}

	public Map<Asignatura, EstadoAsignatura> getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Map<Asignatura, EstadoAsignatura> asignatura) {
		this.asignatura = asignatura;
	}

	public boolean borrarAsignatura(String nombre) {
		Iterator<Map.Entry<Asignatura, EstadoAsignatura>> iterator = asignatura.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Asignatura, EstadoAsignatura> entry = iterator.next();
			if (entry.getKey().getNombre().equalsIgnoreCase(nombre)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	public void mostrarAsignaturas() {
		if (!asignatura.isEmpty()) {
			System.out.println("************");
			System.out.println("Nombre: " + nombre);
			System.out.println("Asignaturas");
			for (Map.Entry<Asignatura, EstadoAsignatura> entry : asignatura.entrySet()) {
				System.out.println(entry.getKey() + " - Estado Actual: " + entry.getValue());
			}
		}

	}

}
