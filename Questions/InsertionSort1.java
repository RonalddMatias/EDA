import java.util.Arrays;

public class InsertionSort1 {
    // O insertionSort é um algoritmo de ordenação que tem como principio inserir um determinado elemento
    // na sua devida posição através de comparações;

    // Utilizaçao do insertionSort quando todo o array está ordenado, menos a ultima posição.
    public static void main(String[] args) {
        int[] numeros = new int[]{7, 12, 14, 18,51,60,73,90,23};

        int j = numeros.length -1;
        while(j > 0 && numeros[j] < numeros[j-1]){
            swap(numeros, j, j-1);
            System.out.println(Arrays.toString(numeros));
            System.out.println();
            j--;    
        }
    }


    private static void swap(int[] numeros, int j, int i) {
        int aux = numeros[j];
        numeros[j] = numeros[j-1];
        numeros[j-1] = aux;
    }
}
