import java.util.Arrays;

public class SelectionSort {
    // O Selection Sort tem como principio selecionar, ou seja, o que devemos fazer é selecionar um elemento e comparar com
    // o próximo, se esse elemento for menor, então a troca é realizada.

    public static void main(String[] args) {
        int[] numeros = new int[]{99,5,23,0,4,1};

        for(int i = 0; i < numeros.length; i++){
            int menor_index = i;
            for(int j = i + 1;j < numeros.length; j++){
                if(numeros[j] < numeros[menor_index]){
                    menor_index = j;
                }
            }
            int auxiliar = numeros[i];
            numeros[i] = numeros[menor_index];
            numeros[menor_index] = auxiliar;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
