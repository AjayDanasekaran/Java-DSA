//Multi-Dimensional array
package com.akshayprogramming;
import java.util.Arrays;
import java.util.Scanner;
public class Array4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[2][2];
		arrInsert(a);
//		arrInsert(b);
//		matriceAdd(a,b);
		matriceDiagonal(a);
		matriceDia(a);
	}
	
	public static void arrInsert(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	public static void arrPrint(int a[][]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int []i:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		
		System.out.println(Arrays.deepToString(a));
	}
	public static void matriceAdd(int a[][],int b[][]) {
		int c[][]= new int[2][2]; //arr[0].length
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(c));
	}
	
	public static void matriceSub(int a[][],int b[][]) {
		int c[][]= new int[2][2]; //arr[0].length
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j]-b[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(c));
	}
	
	public static void matriceDiagonal(int a[][]) {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum1+=a[i][j];
				}
				
				if(i+j==a.length-1) {
					sum2+=a[i][j];
				}
			}
		}
		
		System.out.println("Primary Diagonal Sum : "+sum1);
		System.out.println("Secondary Diagonal Sum : "+sum2);
		System.out.println(sum1+sum2);
	}
	
	public static void matriceDia(int a[][]) {
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(j%2==0) {
					sum1+=a[i][j];
				}
			}
		}
		
		System.out.println("Primary Diagonal Sum : "+sum1);
	}
}
