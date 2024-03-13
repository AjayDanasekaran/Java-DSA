package ArrayProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx5 {
	public static void main(String[] args) {
		int []a= {3,6,9,2};
		int[]b= {1,2,3,4,4,5};
		int[]c = {2,1,3,1,6,8,3,1};
		System.out.println(Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
//		addElement(a,2,10);
//		removeElement(b,3);
		removedup(c);
	}
	public static void addElement(int []a,int index,int value) {
		int []b = new int[a.length+1];
		int ind=0;
		for(int i=0;i<b.length;i++) {
			if(i==index) {
				b[i] = value;
			}
			else {
				b[i]=a[ind++];
			}
		}
		System.out.println(Arrays.toString(b));
	}
	public static void removeElement(int []a,int index) {
		int []b = new int[a.length-1];
		int ind=0;
		for(int i=0;i<b.length;i++) {
			if(i==index) {
				b[i]=a[ind+1];
				ind++;
			}
			else {
				b[i]=a[ind++];
			}
//			if(i<index) {
//				b[i]=a[i];
//			}
//			else {
//				b[i]=a[i+1];
//			}
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void removedup(int[]a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[j]!=-1) {
					a[j]=-1;
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(a));
//		count=count/2;e3
		int[]b = new int[a.length-count];
		int ind=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1) {
				b[ind++]=a[i];
			}
//			else {
//				
//			}
		}
		System.out.println(Arrays.toString(b));
	}
	
}
