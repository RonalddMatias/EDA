import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] numeros = sc.nextLine().split(" ");


        for(int i = 0; i <  numeros.length; i++ ){
            for(int j = 0; j < numeros.length-1; j++){
                int temp1 = Integer.parseInt(numeros[j]);
                int temp2 = Integer.parseInt(numeros[j+1]);
                if(temp1 > temp2){
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = Integer.toString(temp1);
                    for(int k = 0; k < numeros.length; k ++){
                    }
                } 
            }
            }
        }

        
    }
