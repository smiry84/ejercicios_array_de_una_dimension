package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int cantidad= sc.nextInt();
        String[] reyes = new String[cantidad];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for(int i=0; i<cantidad; i++){
            reyes[i] = sc.next();
        }
        System.out.println("Los reyes introducidos son: ");
        for(int i=0; i<cantidad; i++){
            int n= repeticiones(reyes[i],reyes,i);
            System.out.println(reyes[i] + n + "º");
        }
    }
    
    
    public static int repeticiones(String nombre, String[] cadenas, int i){
        int apariciones = 0;
        for(int j=0; j<=i; j++){
            if(nombre.equalsIgnoreCase(cadenas[j])){
                apariciones++;
            }
        }
        return apariciones;
    }
    
}
