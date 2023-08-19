import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] numeros = new int[]{45, 30, 27, 20, 19};

        for(int i = 1; i < numeros.length; i++){
            int j = i;
            while(j > 0 && numeros[j] < numeros[j-1]){
                swap(numeros, j, j-1);
                j--;
                System.out.println(Arrays.toString(numeros));
                System.out.println();
            }
        }
    }

    private static void swap(int[] numeros, int j, int i) {
        int aux = numeros[j];
        numeros[j] = numeros[j-1];
        numeros[j-1] = aux;
    }
}
