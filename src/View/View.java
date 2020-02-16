package View;
/**
 *
 * @author Daniel Camacho
 */
import Controller.ControllerSen;
import Controller.ControllerOperations;
import Model.Model;
import java.util.Scanner;

public class View {

    int grados = 0; //Se crea la variable que el usuario va a ingresar
    int iteraciones = 0; //Se crea la variable que el usuario va a ingresar

    public void interfaz() {
        int opc;
        ControllerOperations CO = new ControllerOperations(); //Se crea un objeto de tipo ControllerOperations - Instancia
        ControllerSen CS = new ControllerSen(); //Se crea un objeto de tipo ControllerSen - Instancia
        Model M = new Model(); //Se crea un objeto de tipo Model - Instancia

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Funcion del Seno");
            System.out.println("1.Seno\n7.Salir");
            opc = leer.nextInt();
            int datos = 0;
            switch (opc) {
                case 1:
                    System.out.print("Ingrese las iteraciones: ");
                    iteraciones = leer.nextInt(); //Guardo el dato que ingreso el usuario en Iteraciones
                    System.out.print("Ingrese los grados: ");
                    grados = leer.nextInt();//Guardo el dato que ingreso el usuario en Grados
                    M.datos(grados,iteraciones); //Mando los datos ingresados por el usuario al modelo
                    System.out.println("El seno de " + grados + "° es de: " + CS.sin(grados, iteraciones));
                    break;

            }
        } while (opc != 7);
        System.out.println("Vuelve pronto!");
    }
}
