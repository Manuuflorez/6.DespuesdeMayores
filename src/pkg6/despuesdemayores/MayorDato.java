package pkg6.despuesdemayores;
/*Crear un algoritmo que lea un vector de tamaño N de números 
enteros, luego imprima los elementos que se encuentren después 
de la posición que ocupa el mayor dato
 */
import java.util.Scanner;

public class MayorDato {

    int[] Datos;

    public MayorDato(int[] Datos) {
        this.Datos = Datos;
    }

    public void LlenarDatos() {
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < Datos.length; i++) {
            Datos[i] = new Scanner(System.in).nextInt();
        }
    }

    public void NumMayor() {
        int temporal = 0;
        int posicion = 0;
        for (int i = 0; i < Datos.length; i++) {
            if (Datos[i] > temporal) {
                temporal = Datos[i];
                posicion = i;
            }

        }
        for (int i=0; i<Datos.length; i++){
            if (i>=posicion){
                
                System.out.println(Datos[i]);
            }
        }
        
    }
}
