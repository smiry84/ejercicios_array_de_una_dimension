package array_de_una_dimension;

public class Ejercicio10 {

    public static void main(String[] args) {
        int[] array = new int[20];
        int num_pares = 0;
        int num_impares = 0;
        System.out.print("Array original: [ ");
        for(int i=0; i<20; i++){
            array[i]=(int)(Math.random() * 101);
            System.out.print(array[i] + " ");
            if(array[i]%2 == 0){
                num_pares++;
            }else {
                num_impares++;
            }
            
        }
        System.out.println(" ]");
        
        int[] pares = new int[num_pares];
        int[] impares = new int[num_impares];
        num_pares = 0;
        num_impares = 0;
        for(int numero : array){
            if (numero%2 == 0){
                pares[num_pares]= numero;
                num_pares++;
            }else{
                impares[num_impares] = numero;
                num_impares++;
            }
        }
        
        int k = 0;
        for (int i=0; i< pares.length; i++){
            array[k] = pares[i];
            k++;
        }
        for (int i=0; i< impares.length; i++){
            array[k] = impares[i];
            k++;
        }
        
        System.out.print("Array organizado: [ ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");    
        }
        System.out.println(" ]");
    }
    
}
