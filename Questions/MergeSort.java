import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = new int[]{2,811,10,7,17,20,25};

        mergeSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }

    public static void mergeSort(int[] v, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;
            mergeSort(v, left, middle);
            System.out.println(Arrays.toString(v));
            mergeSort(v, middle + 1,right);

            merge(v, left, middle, right);
        }
    }

    public static void merge(int [] v, int left, int middle, int right){

        // Transfere todos os elementos entre left and right
        int[] helper = new int[v.length];
        for(int i = left; i<= right; i++){
            helper[i] = v[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while(i <= middle && j <= right){
            if(helper[i] <= helper[j]){
                v[k] = helper[i];
                i++;
            } else {
                v[k] = helper[j];
                j++;
            }
            k++;
        }

        // append se a primeira metade não for consumida
        while (i <= middle){
            v[k] = helper[i];
            i++;
        }

        // append se a segunda metade não for consumida
        while (j <= right){
            v[k] = helper[j];
            j++;
      }
    }
}
