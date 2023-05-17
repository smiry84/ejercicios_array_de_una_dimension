package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperaturas = new int[12];
        
        for(int i=0; i<12; i++){
            System.out.print("Intruduzca la temperatura media que se produjo en el año pasado en el mes " + (i+1) + " : " );
            temperaturas[i] = sc.nextInt();
        }
        
        diagramaDeBarras(temperaturas);
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
    
    public static void diagramaDeBarras(int[] vector){
        int t_minima = calcula_minimo(vector);
        int t_maxima = calcula_maximo(vector);
        System.out.print("TEMPERATURA : ");
        for(int i=t_minima; i<=t_maxima; i++){
            System.out.print(i + " " );
        }
        System.out.println();
        for(int i=0;i<vector.length;i++){
           System.out.print("MES " + i + " :       ");
           for(int j=t_minima; j<=vector[i]; j++){
               System.out.print(" * ");
           }
           System.out.println();
           
        }
    }
    
}
