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
		return exito;
	}

	public boolean mostrarAsignaturas() {
		boolean exito = false;
		return exito;
	}

}
