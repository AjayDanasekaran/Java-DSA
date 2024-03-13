package ArrayProgramming;
import java.util.Arrays;

public class ArraysEx6 {
	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4,3,5,5,5,100,100,100};
//		System.out.println("Array Length : "+arr.length);
		freq(arr);
	}
	public static void freq(int arr[]) {
		int max=0;
		for(int var:arr) {
			if(max<var) {
				max=var;
			}
		}
//		System.out.println("Max length : "+max);
		int arr1[] = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			arr1[arr[i]]++;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0)
				System.out.println(i+" Occurence : "+arr1[i]);
		}
//		System.out.println(Arrays.toString(arr1));
//		System.out.println("Index\tFrequency");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(i + "\t\t" + arr1[i]);
//        }
	}
}
