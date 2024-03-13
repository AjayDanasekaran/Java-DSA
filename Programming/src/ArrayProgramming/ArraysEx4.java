package ArrayProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int arr1[] = {23,5,509,5,33,5};
//		swap(9,3);
//		reverse(arr);
//		swapIn(arr);
//		rotate(arr,5 );
//		noSpaceRotate(arr,2);
		
		int []freq = frequency(arr1);
		System.out.println("Enter number of queries");
		int q = sc.nextInt();
		while(q>0) {
			System.out.println("Enter number to be searched");
			int x = sc.nextInt();
			if(freq[x]>0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			q--;
		}
		
	}
	
//	SWAPPING TWO INTEGERS in TWO WAYS
	public static void swap(int a,int b) {
//		int temp;
//		temp = c;
//		c=b;
//		b=temp;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap A : "+a);
		System.out.println("After swap B : "+b);
	}

//	REVERSING ARRAY
	public static int[] reverse(int arr[]) {
//		int rev[] = new int[arr.length];
//		int ind = 0;
//		ONE WAY
//		for(int i =arr.length-1;i>=0;i--) {
//			rev[ind++] = arr[i];
//		}
		
//		TWO WAY
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++)
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}
		return arr;
	}
//	Swap method first and last index
	public static void swapIn(int arr[],int i,int j) {
//		int i = 0,j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
//	Rotate an array acc to k using extra spaces
	public static void rotate(int arr[],int k) {
		int n = arr.length;
		k = k%n;
		int []ans = new int[n];
		int j = 0;
		
		for(int i = n-k;i<n;i++) {
			ans[j++]=arr[i];
		}
		for(int i = 0;i<n-k;i++) {
			ans[j++]=arr[i];
		}
		System.out.println(Arrays.toString(ans));
	}
	
//	Rotate an array acc to k without using extra spaces
	public static void noSpaceRotate(int arr[],int k) {
		int n = arr.length;
		k = k%n;
		swapIn(arr,0,n-k-1);
		swapIn(arr,n-k,n-1);
		swapIn(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	
//	Query and frequency
	public static int[] frequency(int arr[]) {
		int freq[] = new int[10001];
		
		for(int i = 0 ;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
}