import java.util.Arrays;
import java.util.Scanner;

public class InserePrimeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] numeros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        int j = numeros.length - 1;

        while(j > 0 && numeros[j] < numeros[j-1]){
            int aux = numeros[j];
            numeros[j] = numeros[j-1];
            numeros[j-1] = aux;
            j--;
        }

        System.out.println(Arrays.toString(numeros));
    }
}
