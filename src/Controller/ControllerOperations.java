package Controller;
/**
 *
 * @author Daniel Camacho
 */
import java.util.Scanner;

public class ControllerOperations {

    public double pi; //Se crea variable para utilizar en el metodo GradosRadianes
    Scanner leer = new Scanner(System.in); //Creo variable para leer los datos que ingresa el usuario

    public ControllerOperations() {
        pi = 3.14159265358979323846; //Le doy un valor especifico a pi
    }

    public int Factorial(int numero) { //En este metodo genero el factorial del numero ingresado por parte del usuario
        int fact; //Creo una variable de tipo Entera
        int resp = 1; //Creo una variable de tipo Entera
        if ((numero == 0) || (numero == 1)) { //Si el numero es = 0 y/o numero = 1, entonces: 
            fact = 1; //fact es igual a 1
        } else { // si no, entonces: 
            for (int i = 2; i <= numero; i++) {
                resp *= i; 
            }
        }
        fact = resp;
        return fact;
    }

    public double Potencia(double numero, int exp) {//En este metodo genero la potencia de acuerdo al numero ingresado y el exponente
        double pot = numero;
        if (exp == 0) {
            pot = 1;
        } else if (exp > 0) {
            for (int i = 1; i < exp; i++) {
                pot *= numero;
            }
        } else if (exp < 0) {
            for (int i = 1; i < exp; i++) {
                pot *= numero;
            }
            pot = 1 / pot;
        }
        return pot;
    }

    public double GradosRadianes(int grados) { //En este metodo se convierte de grados a radianes, segun el dato ingresado por el usuario.
        double radianes = grados * pi / 180;
        return radianes;
    }

    public int signo(int exp) {//En este metodo se genera el signo del exp
        if (exp % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
