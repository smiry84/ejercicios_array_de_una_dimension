package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        
        // LLENAMOS EL VECTOR
        for(int i=0; i<numeros.length; i++){
                System.out.print("Introduce el numero en posicion " + i + " : ");
                numeros[i]=sc.nextInt();
        }
        
        //PINTAMOS EN ORDEN INVERSO
        for(int i=numeros.length - 1; i>= 0; i-- ){
            System.out.println("numeros [" + i +"] = " + numeros[i]);
        }
    }
    
}
