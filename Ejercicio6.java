package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[15];
        for(int i=0 ; i<15 ; i++){
            System.out.print("Introduce el numero de la posicion " + i + ": ");
            if (i == 14){
                array[0]=sc.nextInt();
            }else{
                array[i+1]=sc.nextInt();
            }
        }
        
        for(int i=0; i<15; i++ ){
            System.out.println("Array [" + i +"] = " + array[i]);
        }
    }
    
}
