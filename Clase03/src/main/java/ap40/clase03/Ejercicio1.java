package ap40.clase03;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    /**
     * consigna: Dado un String y una letra, que cuente la cantidad de
     * apariciones de la letra en el String.
     *
     */
    public void puntoA() {

        System.out.println("ejercicio 1 - punto A");

        String unString = "hola que tal";

        char unaLetra = 'a';

        int cantidadApariciones = 0;

        for (int i = 0; i < unString.length(); i++) {

            if (unString.charAt(i) == unaLetra) {
                cantidadApariciones++;
            }

        }

        System.out.println("la letra \"" + unaLetra + "\" aparece " + cantidadApariciones + " veces en \"" + unString + "\"");

    }

    /**
     * consigna: Dados 3 números y un orden (ascendente o decreciente) que
     * ordene los mismos y los retorne en un vector de 3
     */
    public void puntoB() {
        System.out.println("ejercicio 1 - punto B");

        int[] numeros = {25, 1, 70};

        String orden = "decreciente";

        if (orden.equalsIgnoreCase("ascendente")) {
            Arrays.sort(numeros);
        } else if (orden.equalsIgnoreCase("decreciente")) {
            Arrays.sort(numeros);
            int numeroTemporal = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = numeroTemporal;
        }

        System.out.println("numeros ordenados en orden: " + orden);
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }

    /**
     * consigna: dado un vector de números, y un número X, que sume todos los
     * números > X y retorne el resultado
     *
     */
    public void puntoC() {
        
        System.out.println("ejercicio 1 - punto C");
        
        int[] numeros = {2,4,8,16,32,64};
        
        int numeroX = 9;
        
        int sumaNumerosMayoresANumeroX = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > numeroX){
                sumaNumerosMayoresANumeroX += numeros[i];
            }
        }
        
        System.out.println("el resultado de la suma es: " + sumaNumerosMayoresANumeroX);

    }

}