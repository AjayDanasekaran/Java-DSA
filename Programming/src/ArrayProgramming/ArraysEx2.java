package ArrayProgramming;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		int arr[] = new int[5];
		int arr[] = {2,45,76,22,1};
//		System.out.println("Original Array");
//		printArr(arr);
		
		//taking input for array using for loop
//		for(int i =0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
		
//		for(int x : arr ) {
//			System.out.println(x);
//		}
		
		//copying an array - shallow copy / creates only reference
//		int arr2[]= arr;
		
		//cloning using arr.clone will allocate new memory in heap
//		int arr2[]= arr.clone();
		
		//copying using Arrays package copyof
		int arr2[] = Arrays.copyOf(arr, arr.length);
		
		//copying using Arrays package copyofrange
//		int arr2[] = Arrays.copyOfRange(arr,1, arr.length);
		
//		for(int x : arr2 ) {
//			System.out.print(x+" ");
//		}
		
//		System.out.println("Copied arr Array");
//		printArr(arr2);
		
		//modifying array and printing 
//		arr2[0] = 10;
//		arr2[1] = 20;
		
//		System.out.println("Modified arr2 Array");
//		printArr(arr);
//		
//		System.out.println("Modified arr2 Array");
//		printArr(arr2);
		
		int arr3[] = {5,6,5,1,5,6};
//		Arrays.sort(arr3);
//		for(int i : arr3){
//			System.out.print(i+" ");
//		}
		
		int arr4[] = {1,2,4,6,9}; 
		System.out.println("Enter the value of Occurence to be found?");
		int x =sc.nextInt();
		
//		int count  = arrOccurence(arr3,x);
//		System.out.println("Occurence of "+x+" is "+count+" times");
		
//		int last  = lastOccurence(arr3,x);
//		System.out.println("Last Occurence of "+x+" is "+last);
		
		int c = strictOccurence(arr3,x);
		System.out.println("Strictly greater of "+x+" is "+c+" times");
		
//		boolean sort = isSorted(arr3);
//		System.out.println(sort);
//		
//		boolean sort1 = isSorted(arr4);
//		System.out.println(sort1);
		
//		int []a = smallAndBig(arr4);
//		printArr(a);
		
	}
	
	//method to print n arrays
	static void printArr(int a[]) {
		for(int x : a ) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	//Number of Occurrence
	static int arrOccurence(int a[],int x) {
		int count  = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i] == x)
				count++;
		}
		return count;
	}
	
	//last Occurrence
	static int lastOccurence(int a[],int x) {
		int lastindex = -1;
		for(int i = 0;i<a.length;i++) {
			if(a[i] == x)
				lastindex = i;
		}
		return lastindex;
	}
	
	//count Strictly greater than x Occurrence
		static int strictOccurence(int a[],int x) {
			int count = 0;
			for(int i = 0;i<a.length;i++) {
				if(a[i] > 0)
					count++;
			}
			return count;
		}
		
		static boolean isSorted(int a[]) {
			boolean check = true;
			for(int i = 1;i<a.length;i++) {
				if(a[i]<a[i-1]) {
					check = false;
					break;
				}
			}
			return check;
		}
		
		static int[] smallAndBig(int a[]){
			Arrays.sort(a);
			int b[] = {a[0],a[a.length-1]};
			return b;
		}
		
}

