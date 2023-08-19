import java.util.Arrays;
import java.util.Scanner;

public class marianaLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] livros = sc.nextLine().split(",");
        
        for (int i = 1; i < livros.length; i++) {
            int j = i;
            while(j >= 0 && livros[j].compareTo(livros[j-1]) < 0){ // numero negatico
                swap(livros, j, j-1);
                j--;
                System.out.println(Arrays.toString(livros));
            }
        }




    }

    private static void swap(String[] livros, int j, int i) {
        String aux = livros[j];
        livros[j] = livros[i];
        livros[i] = livros[j];
    }
}
