package array_de_una_dimension;

public class Ejercicio21 {

    public static void main(String[] args) {
        int[] vector = new int [15];
        for(int i=0; i<15; i++){
            vector[i] = (int) (Math.random() * 501);
        }
        System.out.println("Array original: ");
        for(int valor: vector){
            System.out.print(valor + " ");
        }
        System.out.println();
        
        for(int i=0; i<15; i++){
            if(vector[i] % 5 != 0){
                vector[i] = vector[i] + ( 5 - vector[i] % 5);
            }
        }
        System.out.println("Array cincuerizado: ");
        for(int valor: vector){
            System.out.print(valor + " ");
        }
        System.out.println();
    }
    
}
