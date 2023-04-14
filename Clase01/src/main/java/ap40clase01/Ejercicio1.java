package ap40clase01;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    /*
    * consigna: 
    * Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”
     */
    public void puntoA() {

        System.out.println("##### punto a del ejercicio 1 #####");

        int numeroInicio = 1;
        int numeroFin = 10;

        while (numeroInicio <= numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio++;
        }

    }

    /*
    * consigna: 
    * A lo anterior, solo muestre los números pares
     */
    public void puntoB() {
        System.out.println("##### punto b del ejercicio 1 #####");

        int numeroInicio = 1;
        int numeroFin = 10;

        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }
    }

    /*
    * consigna: 
    *A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
     */
    public void puntoC() {
        
         System.out.println("##### punto c del ejercicio 1 #####");

        int numeroInicio = 1;
        int numeroFin = 10;
        
        boolean mostrarPares = false;

        while (numeroInicio <= numeroFin) {
            if (mostrarPares && numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }else if (!mostrarPares && numeroInicio % 2 != 0) {
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }
        
    }
    
    
    /*
    * consigna;
    * Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
    */
    
    public void puntoD(){
         System.out.println("##### punto d del ejercicio 1 #####");

        int numeroInicio = 1;
        int numeroFin = 10;
        
        for (int i = numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
    }

}
