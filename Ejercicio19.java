package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int [12];
        
        for(int i=0; i<12; i++){
            vector[i] = (int) (Math.random() * 201);
        }
        //PARA COMPROBAR LOS RESULTADOS
        System.out.println("VECTOR ORIGINAL: ");
        mostrar(vector);
        
        System.out.print("Introduzca el número que quiere insertar: ");
        int valor = sc.nextInt();
        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = sc.nextInt();
        
        for(int i=vector.length - 1; i>posicion; i--){          
            vector[i]=vector[i-1];  
        }
        vector[posicion]=valor;
        System.out.println("VECTOR FINAL: ");
        mostrar(vector);
    }
    
    
    
    public static void mostrar(int[] vector){
        System.out.print("Indice  : ");
        for(int i=0; i<vector.length; i++){
            System.out.print(" " + i + "  ");
        }
        System.out.println();
        System.out.print("Valor : "); 
        for(int valor : vector){
            System.out.print(" " + valor + " ");
        }
        System.out.println();
    }
    
}
