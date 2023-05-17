package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[] mesas = new int[10];
        int mesa = 0;
        
        for(int i=0; i<10; i++){
            mesas[i] = (int) (Math.random() * 5);
        }
        
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        opcion = sc.nextInt();
        
        while(opcion != -1){
            if(opcion > 4){
                System.out.println("Lo siento, no admitimos grupos de " + opcion +" haga grupos de 4 personas como máximo e intente de nuevo");
            } else  if(vacias(mesas)){
                        mesa = buscaMesaVacia(mesas);
                        pinta(mesas);
                        System.out.println("Por favor, siéntense en la mesa número " + (mesa + 1));
                        mesas[mesa] = mesas[mesa] + opcion;
                     } else  if(sitio(mesas,opcion)){
                                mesa = buscaMesa(mesas,opcion);
                                pinta(mesas);
                                System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (mesa + 1));
                                mesas[mesa] = mesas[mesa] + opcion;
                            } else {
                                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                                }
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            opcion = sc.nextInt();
        }
        System.out.println("Gracias. Hasta pronto.");
        
    }
    
    public static boolean vacias(int[] vector){
        boolean respuesta = false;
        int i = 0;
        while((respuesta == false) && i<vector.length){
            if(vector[i] == 0){
                respuesta = true;
            } else{
                i++;
            }
        }
        return respuesta;
    }
    
    public static boolean sitio(int[] vector, int numero){
        boolean respuesta = false;
        int i = 0;
        while((respuesta == false) && i<vector.length){
            if(vector[i] + numero <= 4){
                respuesta = true;
            } else{
                i++;
            }
        }
        return respuesta;
    }
    
    public static int buscaMesaVacia(int[] vector){
        int n =0;
        boolean seguir = true;
        while ( seguir && (n<vector.length)){
            if(vector[n] == 0){
                seguir = false;
            }else{
                n++;
            }
        }
        return n;
    }
    
    public static int buscaMesa(int[] vector, int numero){
        int n =0;
        boolean seguir = true;
        while ( seguir && (n<vector.length)){
            if(vector[n] + numero <= 4){
                seguir = false;
            }else{
                n++;
            }
        }
        return n;
    }
    
    public static void pinta(int[] vector){
        System.out.print("mesa nº:   ");
        for(int i=0; i<vector.length; i++){
            System.out.print(" " + (i+1) + " " );
        }
        System.out.println();
        
        System.out.print("ocupacion: ");
        for(int i=0; i<vector.length; i++){
            System.out.print(" " + vector[i] + " " );
        }
        System.out.println();
    }
    
}
