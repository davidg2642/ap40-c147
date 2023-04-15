package ap40.clase04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    /**
     * consigna: Haga un metodo donde por parámetro envíe la ruta de un
     * archivo.Ese archivo debe contener números.El programa debe escribir por
     * consola la suma de esos números
     *
     *
     *
     * @param archivo
     * @param operacion
     */
    public void puntoA(String archivo, String operacion) {

        File rutaActual = new File("");

        String rutaArhivo = rutaActual.getAbsolutePath() + archivo;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArhivo))) {

            int numero1 = Integer.parseInt(br.readLine());
            int numero2 = Integer.parseInt(br.readLine());
            if (operacion.equalsIgnoreCase("sumar")) {
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
            } else if (operacion.equalsIgnoreCase("multiplicar")) {
                System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
            } else {
                System.out.println("operacion incorrecta solo se puede seleccionar: sumar o multiplicar");
            }
            br.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}