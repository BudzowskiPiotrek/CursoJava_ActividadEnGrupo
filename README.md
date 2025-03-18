## Actividad Final 

● Actividad 

Desarrollar un sistema para gestionar información de personal y estudiantes, 
utilizando herencia, colecciones y control de tipos de objetos. 

## Clase Personal: 

○ Atributos: nombre: String que representa el nombre del personal. 

○ Métodos: 

○ Constructor para inicializar el nombre. 

○ toString(): Método que devuelve la información del personal (nombre y 
mención de que es personal interno). 

● Clase Estudiante, que hereda de Personal: 

○ Atributos: asignaturas: Map<Asignatura, EstadoAsignatura> donde la clave la 
asignatura en si misma y el valor es un enum EstadoAsignatura 
(SUPERADO, CURSADO, ABANDONADO). 

○ Métodos: 

○ Constructor para inicializar el nombre y el mapa de asignaturas. 

○ anadirAsignatura(Asignatura A, EstadoAsignatura estado): Método para 
añadir una asignatura al mapa. 

○ borrarAsignatura 

○ mostrarAsignaturas 

○ No tendremos toString en esta clase. 
Clase Asignatura: 

● Atributos: nombre: String que representa el nombre de la asignatura, profesor: String 
que representa el nombre del profesor de la asignatura, creditos: int que representa 
los créditos de la asignatura. 

● Métodos: 

● Constructor para inicializar todos los atributos. 

● toString(): Método que devuelve una representación string de la asignatura, 
incluyendo todos sus atributos. 
Enum EstadoAsignatura: 

● Valores: SUPERADO, CURSADO, ABANDONADO 

## Funcionalidades del Sistema 

Utilizar un ArrayList<Personal> para almacenar tanto objetos Personal como Estudiante. Y 
un menú que permitirá: 

● Añadir Personas: Permitir al usuario añadir objetos Personal o Estudiante a la 
colección. 

● Eliminar Personas: Permitir al usuario eliminar personas por nombre. 

● Añadir y eliminar asignaturas pero solo a los estudiantes. 

● Mostrar Informacion: Si el objeto es de tipo Personal, mostrar solo el nombre y que 
es personal interno. Si el objeto es de tipo Estudiante, mostrar el nombre y los 
detalles de todas las asignaturas registradas, incluyendo el nombre, créditos y 
profesor. 

● Utilizar el operador instanceof para determinar si el objeto es Personal o Estudiante 
antes de imprimir su información. 

El trabajo se realizará por parejas y se evaluará en clase el día 26, se deberá de presentar 
un código único por cada pareja. Los dos integrantes de la pareja deben saber que hace el 
código exactamente puesto que cualquiera de los dos puede ser preguntado en cualquier 
momento por el motivo de la implementación. 
Podéis utilizar herramientas colaborativas como jdoodle o trabajar independientemente y 
después unir códigos. 
Cada método debe de ir precedido de un comentario indicando quien es el autor de la 
siguiente forma: 

/** 
/** 
* Este método sirve para sumar dos números 
*  
* @author Pepito Pérez 
* @param numero1  primer sumando 
* @param numero2 segundo sumando 
* @return La suma de los dos números 
*/ 
public int suma(int numero1, int numero2) { 
return numero1+numero2;  
} 
