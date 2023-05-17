package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int [100];
        String opcion = "";
        
        for(int i=0; i<100; i++){
            array[i] = (int) (Math.random() * 501);
        }
        
        for(int valor : array){
            System.out.print(valor + " ");
        }
        System.out.println();
        
        System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo) : ");
        opcion = sc.next();
        
        switch (opcion){
            case "1":
               int min = calcula_minimo(array);
               pinta(array,min);
               break;
               
            case "2":
                int max = calcula_maximo(array);
                pinta(array,max);
                break;
                
            default :
                System.out.println("Opcion incorrecta");
                
        }
    }
    
    public static int calcula_minimo(int[] vector){
        int minimo = vector[0];
        for(int i=0; i<vector.length; i++){
            if(vector[i]<minimo){
                minimo = vector[i];
            }
        }
        return minimo;
    }
    
    public static int calcula_maximo(int[] vector){
        int maximo = vector[0];
        for(int i=0; i<vector.length; i++){
            if(vector[i]>maximo){
                maximo = vector[i];
            }
        }
        return maximo;
    }
    
    public static void pinta(int[] vector,int valor){
        for(int numero : vector){
            if(numero==valor){
               System.out.print("**"+ numero + "** ");
            } else {
                System.out.print(numero + " "); 
            }
        }
        System.out.println();
    }
    
}
