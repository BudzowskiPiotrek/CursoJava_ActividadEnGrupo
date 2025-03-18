package proyecto;

import java.util.Map;

public class Estudiante extends Persona {
	private Map<Asignatura, EstadoAsignatura> asignatura;

	public Estudiante(String nombre, Map<Asignatura, EstadoAsignatura> asignatura) {
		super(nombre);
		this.asignatura = asignatura;
	}

	public Map<Asignatura, EstadoAsignatura> getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Map<Asignatura, EstadoAsignatura> asignatura) {
		this.asignatura = asignatura;
	}

	public boolean borrarAsignatura(String nombre) {
		boolean exito = false;
		if (asignatura.containsKey(nombre)) {
			asignatura.remove(nombre);
			exito = true;
		}
		return exito;
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
