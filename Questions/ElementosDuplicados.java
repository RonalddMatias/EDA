import java.util.Scanner;

public class ElementosDuplicados {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");
        boolean resposta = false;
        for(int i = 0; i < numeros.length; i++){
            for(int j = i + 1; j < numeros.length; j++){
                if(numeros[i].equals(numeros[j])){
                    resposta = true;
                    break;
                }
        }
    }
        System.out.println(resposta);
    }
}
