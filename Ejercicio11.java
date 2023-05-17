package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [10];
        int ult_primo = 0;
        int aux = 0;
        for (int i=0; i<10; i++){
            System.out.print("Introduce el numero de la posicion " + i + " : ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Array inicial : ");
        mostrar(numeros);
        
        
        for(int i=0; i<10 ;i++){
           if(primo(numeros[i])){
               aux = numeros[i];
               for(int j = i - 1; j>= ult_primo; j--){
                   numeros[j+1]=numeros[j];
               }
               numeros[ult_primo] = aux;
               ult_primo ++;
           }  
        }
        System.out.println("Array final : ");
        mostrar(numeros);
        
        
    }
    
    public static void mostrar(int[] vector){
        System.out.print("Indice : ");
        for(int i=0; i<vector.length; i++){
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.print("Valor : "); 
        for(int valor : vector){
            System.out.print(" " + valor + " ");
        }
        System.out.println();
    }
    
    public static boolean primo(int numero){
        boolean respuesta = true;
        int contador = 2;
        while(respuesta && (contador <= numero/2)){
            if(numero%contador==0){
                respuesta = false;
            } else {
                contador++;
            }
            
        }
        return respuesta;
    }    
}
