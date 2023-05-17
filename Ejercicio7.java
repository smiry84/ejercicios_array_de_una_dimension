package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;
        
        // VAMOS A GENERAR 100 NUMEROS ALEATORIOS EN [0,20]
        int[] numeros = new int[100];
        for (int i=0; i<100; i++){
            numeros[i] = (int) (Math.random() * 21);
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        // PEDIMOS LOS VALORES AL USUARIO
        System.out.print("Indique el valor que desea cambiar: ");
        valor1 = sc.nextInt();
        System.out.print("Indique por qué valor desea cambiarlo: ");
        valor2 = sc.nextInt();
        
        
        //VAMOS CAMBIANDO LAS APARICIONES DEL VALOR1 POR EL VALOR2 Y LO VAMOS MOSTRANDO
        for(int i=0; i<numeros.length; i++){
            if (numeros[i] == valor1){
                numeros[i] = valor2;
                System.out.print("\"" + numeros[i] + "\"" + " ");
            }else{
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
    }
    
}
