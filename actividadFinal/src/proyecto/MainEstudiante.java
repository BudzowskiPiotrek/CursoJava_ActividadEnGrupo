package proyecto;

import java.util.ArrayList;
import java.util.List;
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
					.println("1.Añadir estudiante y su calificacion / 2. Actualizar la calificación de un estudiante. /"
							+ "Eliminar un estudiante. / 4. Mostrar todos los estudiantes y sus calificaciones. "
							+ " / 5. Salir.");
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
				mostrarEstudiantes();
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
		int nueva = numero.nextInt();

		if (nueva == 1) {
			System.out.println("Dime el nombre del estudiante que quieres añadir: ");
		String nombre = letra.nextLine().toUpperCase();
		
		
		
		}
		
	}

	public static void eliminarEstudiante() {
		System.out.println("Introduce el nombre del estudiante");
		String nombre = letra.nextLine().toUpperCase();

		int nota = EstudianteMap.remove(nombre);
		System.out.println("Se ha eliminado el estudiante: " + nombre + ", que tenía un: " + nota);

	}

	public static void mostrarEstudiantes() {
		for (Map.Entry<String, Integer> entrada : EstudianteMap.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
	}

}
