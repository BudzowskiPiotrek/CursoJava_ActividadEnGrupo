package proyecto;

/**
 * Clase base para representar a una persona en el sistema.
 *  @author [María Fernanda]
 */
public class Personal {
	/** Nombre de la persona. */
	protected String nombre;

	/**
	 * Constructor para crear un objeto Personal.
	 *
	 * @param nombre Nombre de la persona.
	 */
	public Personal(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre de la persona.
	 *
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la persona.
	 *
	 * @param nombre El nuevo nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve una representación en cadena del objeto Personal.
	 *
	 * @return Una cadena que representa el objeto Personal.
	 */
	@Override
	public String toString() {
		return "Nombre= " + nombre;
	}
}