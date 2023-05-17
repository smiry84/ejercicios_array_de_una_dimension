package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[8];
        String aux = "";
        int ult_color = 0;
        
        for(int i=0; i<8; i++){
            System.out.print("Introduce la palabra en la posicion " + i + " : ");
            array[i] = sc.next();
        }
        System.out.println("Array inicial : ");
        mostrar(array);
        
        for(int i=0; i<8 ;i++){
           if(color(array[i])){
               aux = array[i];
               for(int j = i - 1; j>= ult_color; j--){
                   array[j+1]=array[j];
               }
               array[ult_color] = aux;
               ult_color ++;
           }  
        }
        System.out.println("Array final : ");
        mostrar(array);
        
    }
    
   public static void mostrar(String[] vector){
        System.out.print("Indice : ");
        for(int i=0; i<vector.length; i++){
            System.out.print("   " + i + "   ");
        }
        System.out.println();
        System.out.print("Valor : "); 
        for(String palabra : vector){
            System.out.print(" " + palabra + " ");
        }
        System.out.println();
    }
   
   public static boolean color(String palabra){
        boolean respuesta = false;
        String[] colores = { "verde", "rojo", "azul", "amarillo",
                             "naranja", "rosa", "negro",
                             "blanco",  "morado" };
        int contador = 0;
        while((respuesta == false) && (contador < colores.length)){
            if(palabra.equalsIgnoreCase(colores[contador])){
                respuesta = true;
            } else {
                contador++;
            }
            
        }
        return respuesta;
    }
}
