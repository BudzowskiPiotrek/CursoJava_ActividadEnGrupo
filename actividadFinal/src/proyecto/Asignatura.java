package proyecto;

import java.util.Objects;

/**
 * Clase que representa una asignatura.
 *  @author [María Fernanda]
 */
public class Asignatura {
	/** Nombre de la asignatura. */
	private String nombre;
	/** Nombre del profesor que imparte la asignatura. */
	private String profesor;
	/** Número de créditos de la asignatura. */
	private int creditos;

	/**
	 * Constructor para crear un objeto Asignatura.
	 *
	 * @param nombre   Nombre de la asignatura.
	 * @param profesor Nombre del profesor.
	 * @param creditos Número de créditos.
	 */
	public Asignatura(String nombre, String profesor, int creditos) {
		this.nombre = nombre;
		this.profesor = profesor;
		this.creditos = creditos;
	}

	/**
	 * Obtiene el nombre de la asignatura.
	 *
	 * @return El nombre de la asignatura.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la asignatura.
	 *
	 * @param nombre El nuevo nombre de la asignatura.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre del profesor.
	 *
	 * @return El nombre del profesor.
	 */
	public String getProfesor() {
		return profesor;
	}

	/**
	 * Establece el nombre del profesor.
	 *
	 * @param profesor El nuevo nombre del profesor.
	 */
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	/**
	 * Obtiene el número de créditos.
	 *
	 * @return El número de créditos.
	 */
	public int getCreditos() {
		return creditos;
	}

	/**
	 * Establece el número de créditos.
	 *
	 * @param creditos El nuevo número de créditos.
	 */
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	/**
	 * Genera el código hash del objeto Asignatura.
	 *
	 * @return El código hash del objeto.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(creditos, nombre, profesor);
	}

	/**
	 * Compara si dos objetos Asignatura son iguales.
	 *
	 * @param obj El objeto a comparar.
	 * @return true si los objetos son iguales, false si no lo son.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return creditos == other.creditos && Objects.equals(nombre, other.nombre)
				&& Objects.equals(profesor, other.profesor);
	}

	/**
	 * Devuelve una representación en cadena del objeto Asignatura.
	 *
	 * @return Una cadena que representa el objeto Asignatura.
	 */
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", profesor=" + profesor + ", creditos=" + creditos + "]";
	}
}