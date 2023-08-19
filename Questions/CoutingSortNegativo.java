import java.util.Arrays;
import java.util.Scanner;

public class CoutingSortNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        
        int maior = sc.nextInt();
        int menor = sc.nextInt();

        int[] num = new int[n.length]; 

        // passando o array para inteiro
        for (int i = 0; i < n.length; i++) {
            num[i] = Integer.parseInt(n[i]);
        }

        System.out.println(Arrays.toString(coutinNegativo(num, maior, menor)));

    }

    public static int[] coutinNegativo(int[] A, int maior,int menor){
        int[] C = new int[maior - menor + 1];

        // Frequência
        for (int i = 0; i < A.length; i++) {
            C[A[i]-menor] += 1;
            System.out.println(Arrays.toString(C));
        }

        // Cumulativa
        for (int i = 1; i < C.length; i++) {
            C[i] = C[i] + C[i-1];
        }
        System.out.println("Cumulativa do vetor de contagem -" + Arrays.toString(C));

        int[] B = new int[A.length];
        // Ordenação
        for (int i = A.length-1; i >= 0; i--) {
            B[C[A[i] -menor]-1] = A[i]; // o "-menor" é para considerar o salto;
            C[A[i] - menor] -= 1;
        }

        return B;
    }
}
