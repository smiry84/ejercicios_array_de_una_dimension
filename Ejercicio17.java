package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int numero = 0;
        for(int i=0; i<10; i++){
            array[i] = (int) (Math.random() * 101);
        }
        // PARA COMPROBAR QUE LO HACE BIEN
        System.out.print("Array original: [" );
        for(int valor : array){
            System.out.print(" " + valor + " " );
        }
        System.out.println("]");
                
        boolean continuar = true;
        while(continuar){
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
            if(esta(numero,array)){
                continuar = false;
            }
        }
        
        
        int n = calculaRotacion(numero,array); 
        for(int i=0; i<array.length - n; i++){
            int aux = array[9];
            for(int j = array.length - 1; j>=0; j--){          
                if (j != 0){
                    array[j]=array[j-1];
                }else{
                    array[0]=aux;
                }
            }   
        }
        
        System.out.print("Array desplazado: [" );
        for(int valor : array){
            System.out.print(" " + valor + " " );
        }
        System.out.println("]");
        
    }

    public static boolean esta(int valor, int[] v){
        boolean respuesta = false;
        int i = 0;
        while((respuesta == false) && i<v.length){
            if(v[i] == valor){
                respuesta = true;
            }else{
                i++;
            }
        }
        return respuesta;
    }
    
    public static int calculaRotacion(int valor, int[] v){
        boolean seguir = true;
        int i = 0;
        while(seguir){
            if(v[i] == valor){
                seguir = false;
            }else{
                i++;
            }
        }
        return i;
    }

    
}


