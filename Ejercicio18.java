package array_de_una_dimension;

import static array_de_una_dimension.Ejercicio19.mostrar;

public class Ejercicio18 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        int num_menores =0;
        int num_mayores =0;
        
        for(int i=0; i<10; i++){
            vector[i] = (int) (Math.random() * 201);
            if(vector[i]<100){
                num_menores ++;
            }else {
                num_mayores ++;
            }
        }
        
        /* PARA COMPROBAR QUE LO HACE BIEN*/
        System.out.println("Array original: " );
        mostrar(vector);
        
        int[] menores = new int[num_menores];
        int[] mayores = new int [num_mayores];
        int j = 0;
        int k = 0;
        for(int i=0; i<10; i++){
            if(vector[i]<100){
                menores[j] = vector[i];
                j++;
            }else {
                mayores[k] = vector[i];
                k++;
            }
        }
        
        j=0;
        if (num_menores < num_mayores){
            for(int i=0;i<num_menores; i++){
                vector[j]= menores[i];
                vector[j+1]= mayores[i];
                j = j + 2;
            }
            for (int i=num_menores;i<num_mayores; i++){
                vector[j]=mayores[i];
                j++;
            }
        } else{
            for(int i=0;i<num_mayores; i++){
                vector[j]= menores[i];
                vector[j+1]= mayores[i];
                j = j + 2;
            }
            for (int i=num_mayores;i<num_menores; i++){
                vector[j]=menores[i];
                j++;
            }
        }
       
        System.out.print("Vector alternado: " );
        mostrar(vector);
        
    }
    
}
