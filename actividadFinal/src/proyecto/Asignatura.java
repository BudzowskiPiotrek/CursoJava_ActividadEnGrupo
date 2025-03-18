package proyecto;

public class Asignatura {
	private String nombre;
	private String profesor;
	private int creditos;

	public Asignatura(String nombre, String profesor, int creditos) {
		this.nombre = nombre;
		this.profesor = profesor;
		this.creditos = creditos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", profesor=" + profesor + ", creditos=" + creditos + "]";
	}
	
	

}
