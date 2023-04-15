package ap40.clase04;

/**
 *
 * @author david
 */
public class Clase04 {

    public static void main(String[] args) {
        System.out.println("Clase 4");

        System.out.println("########## EJERCICIO-1 ##########");
        Ejercicio1 ejercicio1 = new Ejercicio1();

        //ejercicio1.puntoA(4, 5, 1, 'd');
        //ejercicio1.puntoB();
        //ejercicio1.puntoA(3, 4, 7);
        System.out.println("########## EJERCICIO-1 ##########\n");

        System.out.println("########## EJERCICIO-2 ##########");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.puntoA("/src/main/java/resources/archivo.txt", "multiplicar");
        System.out.println("########## EJERCICIO-2 ##########\n");

        System.out.println("########## EJERCICIO-3 ##########");
        Ejercicio3 ejercicio3 = new Ejercicio3();

        ejercicio3.codificarODecodificar("codificar", 1, "/src/main/java/resources/decodificado.txt", "/src/main/java/resources/codificado.txt");
        System.out.println("########## EJERCICIO-3 ##########");
    }
}