package Controller;
/**
 *
 * @author Daniel Camacho
 */
public class ControllerSen {
    
    
    public double sin(int grados, int tamaño){
        ControllerOperations m = new ControllerOperations();
        double sin = 0,suma=0;
        
        for(int i = 0 ; i< tamaño;i++){
            sin=((m.signo(i)/m.Factorial(2*i+1))* m.Potencia(m.GradosRadianes(grados), 2*i+1));
            suma += sin;
        }
        return suma;
    }
    
      
    
}
