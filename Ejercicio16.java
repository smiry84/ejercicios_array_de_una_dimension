package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [20];
        String opcion = "";
        
        for(int i=0; i<20; i++){
            numeros[i] = (int) (Math.random() * 401);
        }
        
        for(int valor : numeros){
            System.out.print(valor + " ");
        }
        System.out.println();
        
        System.out.print("¿Qué numeros quiere resaltar? (1 - los multiplos de 5,"
                                                     + " 2 - los multiplos de 7) : ");
        opcion = sc.next();
        
        switch (opcion){
            case "1":
               destacar(numeros,5);
               break;
               
            case "2":
                destacar(numeros,7);
                break;
                
            default :
                System.out.println("Opcion incorrecta");
                
        }
    }
    
    
    public static void destacar(int[] vector,int valor){
        for(int numero : vector){
            if(numero%valor == 0){
               System.out.print("["+ numero + "] ");
            } else {
                System.out.print(numero + " "); 
            }
        }
        System.out.println();
    }
    
}
