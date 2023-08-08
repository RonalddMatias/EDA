

import java.util.Arrays;
import java.util.Scanner;

// se o tamanho da sequência for impar, mantenha o ultimo elemento.
public class TrocaVizinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");
        
        for(int i = 0; i < numeros.length -1; i += 2){ // O +2 deve-se ao fato de que eu quero pegar somente dois pares
            int temp = Integer.parseInt(numeros[i]);
            numeros[i] = numeros[i+1];
            numeros[i + 1] = Integer.toString(temp);
        }
        
        System.out.println(Arrays.toString(numeros)); 
        
    }
}
