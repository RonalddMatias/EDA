import java.util.Arrays;
import java.util.Scanner;

public class CoutingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        
        int escolha = sc.nextInt();

        int[] num = new int[n.length]; 

        // passando o array para inteiro
        for (int i = 0; i < n.length; i++) {
            num[i] = Integer.parseInt(n[i]);
        }

        System.out.println(Arrays.toString(countingSort(num, escolha)));
    }
    
    public static int[] countingSort(int[] A, int k){ //k é o maior numero do array
        int[] C = new int[k];

        //registrando a frequencia
        for (int i = 0; i < A.length; i++) {
            C[A[i] - 1] += 1;
        }

        // Registrando a cumulativa
        for (int i = 1; i < C.length; i++) {
            C[i] = C[i] + C[i-1];
        }

        // Ordenando
        int[] B = new int[A.length];

        for (int i = A.length -1; i >= 0; i--) {
            B[C[A[i]-1]-1] = A[i];
            C[A[i]-1] -= 1;
        }

        return B;
    }
}
