package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int max, min;
        
        for(int i=0;i<array.length; i++ ){
            System.out.print("Por favor introduzca 10 numeros : ");
            array[i] = sc.nextInt();
        }
       
       max = min = array[0];
       
       for(int i = 0; i<array.length; i++) {
           if(array[i]<min){
               min = array[i];   
           }
           if(array[i]>max){
               max = array[i];   
           }
       }
       
       for(int i=0; i<array.length; i++){
           if(array[i]==max){
             System.out.println("Array [" + i + "]" + array[i] + " maximo");
           } else if(array[i]==min){
             System.out.println("Array [" + i + "]" + array[i] + " minimo");
           } else{
               System.out.println("Array [" + i + "]" + array[i]);
           }
       }
    }
    
}
