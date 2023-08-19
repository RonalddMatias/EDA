import java.util.Arrays;
import java.util.Scanner;

public class particionamentoLomuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split(" ");

        int[] numbers =  new int[num.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(num[i]);
        }
        
        quickSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int left, int right) {
        if(left < right){
            int index_pivot = partition(numbers, left, right);
            quickSort(numbers, left, index_pivot - 1);
            quickSort(numbers, index_pivot+1 ,right);
        }
    }

    public static int partition(int[] values, int left, int right){
        int pivot = values[left];
        int i = left;

        for(int j = i + 1; j <= right; j++){
            if(values[j] <= pivot){
                i++;
                swap(values, i, j);
                System.out.println(Arrays.toString(values));
            }
        }

        swap(values, left, i);
        return i;
    }

    private static void swap(int[] values, int i, int j) {
        int aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    } 
}
