package ap40.clase09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Clase09 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Persona> personas = new ArrayList<>();
            
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("Ingrese la acción que desea realizar:");
                System.out.println("1. Agregar persona");
                System.out.println("2. Listar personas");
                System.out.println("3. Salir");
                
                int accion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                
                switch (accion) {
                    case 1 -> {
                        Persona persona = new Persona();
                        
                        System.out.print("Ingrese el nombre: ");
                        persona.setNombre(scanner.nextLine());
                        
                        System.out.print("Ingrese el apellido: ");
                        persona.setApellido(scanner.nextLine());
                        
                        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
                        persona.setFechaDeNacimiento(scanner.nextLine());
                        
                        personas.add(persona);
                        System.out.println("Persona agregada con éxito.\n");
                    }
                    case 2 -> {
                        System.out.println("Listado de personas:");
                        for (Persona p : personas) {
                            System.out.println("Nombre: " + p.getNombre() + ", Apellido: " + p.getApellido() + ", Fecha de nacimiento: " + p.getFechaDeNacimiento());
                        }
                        System.out.println();
                    }
                    case 3 -> {
                        continuar = false;
                        System.out.println("Saliendo del programa...");
                    }
                    default -> System.out.println("Opción no válida. Intente nuevamente.\n");
                }
            }
        }

    }
}
