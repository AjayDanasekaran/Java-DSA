package ArrayProgramming;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {3, 1, 8, 10, 6};
        for (int i = 0; i < a.length; i++) {
            int smallest_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[smallest_index] > a[j]) {
                    smallest_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest_index];
            a[smallest_index] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
