package ap40.clase03;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public void codificacion() {

        System.out.println("ejercicio 2 - CODIFICACION");

        String unString = "hola que tal";

        char[] caracteresString = new char[unString.length()];

        int desplazamiento = 1;

        for (int i = 0; i < unString.length(); i++) {
            caracteresString[i] = (char) (unString.charAt(i) + desplazamiento);
        }

        String stringCodificado = new String(caracteresString);

        System.out.println("el string codificado: " + stringCodificado);

    }

    public void decodificacion() {

        System.out.println("ejercicio 2 - DECODIFICACION");

        String stringCodificado = "ipmb!rvf!ubm";

        char[] caracteresString = new char[stringCodificado.length()];

        int desplazamiento = 1;

        for (int i = 0; i < stringCodificado.length(); i++) {
            caracteresString[i] = (char) (stringCodificado.charAt(i) - desplazamiento);
        }

        String stringDecodificado = new String(caracteresString);

        System.out.println("el string decodificado: " + stringDecodificado);

    }

}
