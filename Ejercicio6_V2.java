package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio6_V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[15];
        for(int i=0 ; i<15 ; i++){
            System.out.print("Introduce el numero de la posicion " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        //MOSTRAMOS EL ARRAY ORIGINAL
        System.out.print("Array original: [" );
        for(int numero : array){
            System.out.print(" " + numero + " " );
        }
        System.out.println("]");
        
        //GUARDAMOS EL VALOR DE LA ULTIMA POSICION PARA NO PERDERLO
        int aux = array[14];
        for(int i = array.length - 1; i>=0; i--){          
            if (i != 0){
                array[i]=array[i-1];
            }else{
                array[0]=aux;
            }
        }
        
        //MOSTRAMOS EL ARRAY DESPLAZADO
        System.out.print("Array desplazado: [" );
        for(int numero : array){
            System.out.print(" " + numero + " " );
        }
        System.out.println("]");
    }
    
}
