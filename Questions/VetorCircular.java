import java.util.ArrayList;
import java.util.Scanner;

public class VetorCircular{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] numeros = sc.nextLine().split(" ");
        int num = sc.nextInt();

        String out = "";
        int cont = 0;

        for(int i = 0; i <= numeros.length; i++){
            if(cont == num){
                break;
            }
            if(i == (numeros.length)){
                i = 0;
            }
            out += Integer.toString(Integer.parseInt(numeros[i])) + " ";
            cont += 1;
        }
        
        System.out.println(out.trim());

        sc.close();
    }
}