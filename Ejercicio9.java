package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        
        for(int i=0; i<8; i++){
            System.out.print("Introduzca el numero de la posicion "+ i + ": ");
            numeros[i] = sc.nextInt();
        }
        
        for(int numero :numeros ){
            if(numero%2==0){
                System.out.println(numero + " par");
            }else{
                System.out.println(numero + " impar");
            }
        }
    }
    
}
