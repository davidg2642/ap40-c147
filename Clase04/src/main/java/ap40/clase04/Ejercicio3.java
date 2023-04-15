package ap40.clase04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    /**
     * Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si
     * es una codificación o decodificación, el valor del desplazo, y 2
     * archivos, uno para la entrada y otro para la salida.Que por pantalla solo
     * indique si terminó o no correctamente, los resultados deben estar en el
     * archivo de salida
     *
     *
     * @param opcion
     * @param desplazamiento
     * @param entrada
     * @param salida
     */
    public void codificarODecodificar(String opcion, int desplazamiento, String entrada, String salida) {

        if (opcion.equalsIgnoreCase("codificar")) {
            codificar(desplazamiento, entrada, salida);
        } else if (opcion.equalsIgnoreCase("decodificar")) {
            decodificar(desplazamiento, entrada, salida);
        }

    }

    private void codificar(int desplazamiento, String entrada, String salida) {

        File rutaActual = new File("");

        String rutaArhivoEntrada = rutaActual.getAbsolutePath() + entrada;
        String rutaArhivoSalida = rutaActual.getAbsolutePath() + salida;

        String stringACodificar = leerArchivo(rutaArhivoEntrada);

        char[] caracteresString = new char[stringACodificar.length()];

        for (int i = 0; i < stringACodificar.length(); i++) {
            caracteresString[i] = (char) (stringACodificar.charAt(i) + desplazamiento);
        }

        String stringCodificado = new String(caracteresString);

        escribirArchivo(rutaArhivoSalida, stringCodificado);

        System.out.println("completado");
    }

    private void decodificar(int desplazamiento, String entrada, String salida) {
        File rutaActual = new File("");

        String rutaArhivoEntrada = rutaActual.getAbsolutePath() + entrada;
        String rutaArhivoSalida = rutaActual.getAbsolutePath() + salida;

        String stringCodificado = leerArchivo(rutaArhivoEntrada);

        char[] caracteresString = new char[stringCodificado.length()];

        for (int i = 0; i < stringCodificado.length(); i++) {
            caracteresString[i] = (char) (stringCodificado.charAt(i) - desplazamiento);
        }

        String stringDecodificado = new String(caracteresString);

        escribirArchivo(rutaArhivoSalida, stringDecodificado);

        System.out.println("completado");
    }

    private String leerArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void escribirArchivo(String archivo, String unString) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(unString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
