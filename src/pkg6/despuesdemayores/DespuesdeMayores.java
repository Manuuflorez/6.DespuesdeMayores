package pkg6.despuesdemayores;

import java.util.Scanner;

/*Crear un algoritmo que lea un vector de tamaño N de números 
enteros, luego imprima los elementos que se encuentren después 
de la posición que ocupa el mayor dato
 */
public class DespuesdeMayores {

    public static void main(String[] args) {
        System.out.println("Cuantos numeros tendra el vector?");
        int TamanoVector = new Scanner(System.in).nextInt();
        int[] Datos = new int[TamanoVector];
        MayorDato objMayorDato = new MayorDato(Datos);
        objMayorDato.LlenarDatos();
        System.out.println("Los numeros despues del numero mayor son:");
        objMayorDato.NumMayor();
        
    }

}
