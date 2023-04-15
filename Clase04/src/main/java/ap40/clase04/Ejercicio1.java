package ap40.clase04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    /**
     * consigna: haga un metodo, donde por parámetro ponga 3 números y una letra
     * que represente ascendente o descendente y los muestre ordenados por tal
     * criterio
     * @param numero1
     * @param numero2
     * @param numero3
     * @param orden
     */
    public void puntoA(int numero1, int numero2, int numero3, char orden) {

        System.out.println("ejercicio 1 - punto A");

        int[] numeros = {numero1, numero2, numero3};

        ordenarNumerosAscendenteODecreciente(numeros, orden);

    }

    /**
     * lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo
     * (b) si no detecta ninguno.Vea si con una función puede evitar repetir
 código.
     *
     * @param numero1
     * @param numero2
     * @param numero3
     */
    public void puntoA(int numero1, int numero2, int numero3) {

        System.out.println("ejercicio 1 - punto C");

        int[] numeros = {numero1, numero2, numero3};

        ordenarNumerosAscendenteODecreciente(numeros, 'd');

    }

    /**
     * consigna: haga lo mismo, pero solicitando los parámetros de a uno por
     * consola
     *
     */
    public void puntoB() {

        System.out.println("ejercicio 1 - punto B");

        int[] numeros = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese un numero: ");

        numeros[0] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese otro numero: ");

        numeros[1] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese el ultimo numero: ");

        numeros[2] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingrese el orden de los numeros (a=Ascendente o d=Decreciente): ");

        String orden = scanner.nextLine();

        ordenarNumerosAscendenteODecreciente(numeros, orden.charAt(0));

    }

    private void ordenarNumerosAscendenteODecreciente(int[] numeros, char orden) {
        Arrays.sort(numeros);
        switch (orden) {
            case 'a' -> mostrarNumerosAscendenteODecreciente(numeros, "Ascendente");
            case 'd' -> {
                int numeroTemporal = numeros[0];
                numeros[0] = numeros[2];
                numeros[2] = numeroTemporal;
                mostrarNumerosAscendenteODecreciente(numeros, "Decreciente");
            }
            default -> System.out.println("el orden no es correcto utilice a=Ascendente o d=Decreciente");
        }
    }

    private void mostrarNumerosAscendenteODecreciente(int[] numeros, String orden) {

        System.out.println("numeros en orden: " + orden);
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

    }

}
