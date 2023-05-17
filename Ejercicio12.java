package array_de_una_dimension;

import static array_de_una_dimension.Ejercicio11.mostrar;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [10];
        int pos_inicial = 0;
        int pos_final = 0;
        int aux = 0;
        for (int i=0; i<10; i++){
            System.out.print("Introduce el numero de la posicion " + i + " : ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Array inicial : ");
        mostrar(numeros);
        
        System.out.print("Introduce la posicion inicial: ");
        pos_inicial = sc.nextInt();
        System.out.print("Introduce la posicion final: ");
        pos_final = sc.nextInt();
        
        if((0<=pos_inicial) && (pos_inicial<pos_final) && (pos_final<=9)){
            aux = numeros[9];
            for(int i=9;i > pos_final; i--){
                numeros[i]=numeros[i-1];
            }
            numeros[pos_final]=numeros[pos_inicial];
            for(int i=pos_inicial; i>0; i--){
                numeros[i]=numeros[i-1];
            }
            numeros[0] = aux;
            System.out.println("Array final : ");
            mostrar(numeros);
        }else {
            System.out.println("Las posiciones introducidas no son correctas");
        }
        
    }
    
}
