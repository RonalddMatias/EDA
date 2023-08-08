import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplier = sc.nextInt();
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");

        String output = "";
        for(int i = 0; i < numbers.length; i++){
            output += Integer.toString(Integer.parseInt(numbers[i])*multiplier) + " ";
        }   

        System.out.println(output.trim());
        sc.close();
    }
}