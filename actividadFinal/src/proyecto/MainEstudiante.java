package proyecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainEstudiante {
	static Scanner numero = new Scanner(System.in);
	static Scanner letra = new Scanner(System.in);
	static List<Persona> persona = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu = 0;
		while (opcionMenu != 5) {
			System.out
					.println("1. Añadir estudiante o personal / 2. Añadir y/o eliminar asignaturas a estudiantes. / 3. "
							+ "Eliminar un estudiante o personal. / 4. Mostrar información. " + " / 5. Salir.");
			opcionMenu = numero.nextInt();

			switch (opcionMenu) {
			case 1:
				agregarPersona();
				break;
			case 2:
				actualizarNota();
				break;
			case 3:
				eliminarEstudiante();
				break;
			case 4:
				mostrarInformacion();
				break;
			case 5:
				System.out.println("Adiós!");
				break;
			}
		}
	}

	private static void actualizarNota() {
		System.out.println("Dime el nombre del estudiante al que le quieres cambiar la nota:");
		String nombre = letra.nextLine().toUpperCase();

		System.out.println("Dime la nota nueva");
		int nueva = numero.nextInt();

	}

	public static void agregarPersona() {

		System.out.println("¿Qué quieres agregar?: 1. Estudiante / 2. Persona");
		int opcion = numero.nextInt();

		if (opcion == 1) {
			System.out.println("Dime el nombre del estudiante que quieres añadir: ");
			String nombre = letra.nextLine().toUpperCase();

			Persona estudiante = new Estudiante(nombre, null);

			persona.add(estudiante);

			System.out.println("Estudiante añadida correctamente.");

		} else if (opcion == 2) {
			System.out.println("Dime el nombre de la persona que quieres añadir: ");
			String nombre = letra.nextLine().toUpperCase();

			Persona personal = new Persona(nombre);
			persona.add(personal);

			System.out.println("Persona añadida correctamente.");

		} else {
			System.out.println("Número no válido.");
		}

	}

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

	public static void mostrarInformacion() {
		if (persona.isEmpty()) {
			System.out.println("No hay personas registradas.");
			return;
		}

		for (Persona p : persona) {
			if (p instanceof Estudiante) {
				Estudiante estudiante = (Estudiante) p;
				System.out.println("Nombre: " + estudiante.getNombre() + " (Estudiante)");

				// Obtener las asignaturas del mapa
				Map<Asignatura, EstadoAsignatura> asignaturas = estudiante.getAsignatura();

				if (asignaturas == null || asignaturas.isEmpty()) {
					System.out.println("No tiene asignaturas registradas.");
				} else {
					System.out.println("Asignaturas registradas:");
					for (Map.Entry<Asignatura, EstadoAsignatura> entry : asignaturas.entrySet()) {
						Asignatura asignatura = entry.getKey();
						System.out.println(" - " + asignatura.getNombre() + " | Créditos: " + asignatura.getCreditos()
								+ " | Profesor: " + asignatura.getProfesor() + " | Estado: " + entry.getValue());
					}
				}
			} else { // Si no es un estudiante, asumimos que es Personal
				System.out.println("Nombre: " + p.getNombre() + " (Personal Interno)");
			}
			System.out.println("----------------------");
		}
	}

}
