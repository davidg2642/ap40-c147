package ap40.clase06;

/**
 *
 * @author david
 */
public class Calculadora {

    public double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }
    
    public double restar(double numero1, double numero2){
        return numero1 - numero2;
    }
    
    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }
    
    public double dividir(double numero1, double numero2) throws IllegalArgumentException{
        if(numero2 == 0){
            throw new IllegalArgumentException("no se puede dividir entre 0");
        }
        return numero1 / numero2;
    }
    
}
