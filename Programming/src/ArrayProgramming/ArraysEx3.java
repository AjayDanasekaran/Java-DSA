package ArrayProgramming;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysEx3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		int n = sc.nextInt();
//		int arr[] = new int[n];
		int arr[] = {4,6,3,5,8,2};
		int arr2[] = {1,4,5,6,3};
		int arr3[]  = {1,2,3,4,2,1,3};
//		int x = sc.nextInt();
//		findPair(arr,x);
//		findTriPair(arr2,x);
//		uniqueEle(arr3);
		larg(arr);
	}
	
	//to input values into an array
	static void loadArr(int a[]) {
		for(int i =0 ; i< a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	
	//to print an array
	static void printArr(int a[]) {
		for(int i : a) {
			System.out.println(i);
		}
	}
	
	//to find num of pairs == x
	static void findPair(int a[],int x) {
		int pair=0;
		for(int i =0 ; i< a.length;i++) {
			for(int j =i+1 ; j< a.length;j++) {
				if((a[i]+a[j])==x)
					pair++;
			}
		}
		System.out.println(pair);
	}
	
	//to find num triplet of pairs == x
	static void findTriPair(int a[],int x) {
		int pair=0;
		for(int i =0 ; i< a.length;i++) {
			for(int j =i+1 ; j< a.length;j++) {
				for(int k = j+1;k<a.length;k++) {
					if((a[i]+a[j]+a[k])==x)
						pair++;
				}
			}
		}
		System.out.println(pair);
	}
	
	//unique element
	static void uniqueEle(int a[]) {
		for(int i =0 ; i< a.length;i++) {
			for(int j =i+1 ; j< a.length;j++) {
				if(a[i]==a[j]) {
					a[j] = -1;
					a[i] = -1;
				}
			}
		}
		int ans=-1;
		for(int i = 0;i<a.length;i++) {
			if(a[i]!=-1) {
				ans = a[i];	
			}
		}
		System.out.println(ans);
	}
	
	//larg
	static void larg(int a[]) {
		int max = 0;
		for(int i = 0;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
