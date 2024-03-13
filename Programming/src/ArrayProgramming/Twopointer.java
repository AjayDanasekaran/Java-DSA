package ArrayProgramming;
import java.util.Arrays;

//Twopointer
public class Twopointer {
	public static void main(String[] args) {
		int a[] = {0,1,0,1,1,1,0,0,1,0};
		int b[] = {2,3,6,7,9,9,1,8,4};
		int c[] = {-10,-3,-2,1,4,5};
//		sort(a);
//		sort01(a);
//		sort2pointer(a);
//		sortEven(b);
		sqrnsort(c);
	}
	
//	two example methods to solve
	public static void sort(int a[]) {
		for(int i = 0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void sort01(int a[]) {
		int zero = 0;
		for(int i = 0;i<a.length;i++) {
				if(a[i]==0) {
					zero++;
				}
			}
		
		for(int i = 0;i<a.length;i++) {
			if(i<zero) {
				a[i]=0;
			}
			else {
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
//	Actual method to sot 0 and 1
	public static void sort2pointer(int a[]) {
		int left=0,right=a.length-1;
		while(left<right) {
			if(a[left] ==1 && a[right] ==0) {
				ArraysEx4.swapIn(a,left,right);
				left++;
				right--;
			}
			
			if(a[left] == 0) {
				left++;
			}
			
			if(a[right] == 1) {
				right--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
//	even and odd sort
	public static void sortEven(int a[]) {
		int left=0,right=a.length-1;
		while(left<right) {
			if(a[left]%2!=0 && a[right]%2==0) {
				ArraysEx4.swapIn(a,left,right);
				left++;
				right--;
			}
			
			if(a[left]%2==0) {
				left++;
			}
			
			if(a[right]%2!=0) {
				right--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
//	Square and non decreasing order
	public static void sqrnsort(int a[]) {
		int ans[] = new int[a.length];
		for(int i =0;i<a.length;i++) {
			ans[i] = a[i]*a[i];
		}
		sort(ans);
	}
}
