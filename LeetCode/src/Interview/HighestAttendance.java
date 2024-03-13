package Interview;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class HighestAttendance {

public static void highestAt (int N,String[] Name, int M,int [][]Attendance) {
	int[] arr=new int[Name.length];
	for(int i=0;i<Attendance.length;i++) {
		for(int j=0;j<Attendance[i].length;j++) {
			if(Attendance[i][j]!=0) {
					arr[j]++;
			}
//			System.out.println(Arrays.toString(arr));
		}
	}
	System.out.println(Arrays.toString(arr));
	int maxIndex=-1;
	int maxIndex1 =-1;
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			maxIndex=i;
		}
		else if(arr[i]==max) {
			maxIndex1=i;
		}
	}
	if(arr[maxIndex]!=arr[maxIndex1]) {
		System.out.println(Name[maxIndex]+": will be Rewarded");
	}
	else {
		System.out.println(Name[maxIndex]+" and "+Name[maxIndex1]+" Both will be Rewarded");
	}
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr.length;j++) {
//			if()
//		}
//	}
}
public static void main (String[] args){ 
	String[] Name = {"Sam","Tom","Ethan","Marco","Diego"};
	int [][]Attendance = new int[3][Name.length];
	Attendance[0][0]=1;
	Attendance[0][1]=0;
	Attendance[0][2]=1;
	Attendance[0][3]=0;
	Attendance[0][4]=0;
	Attendance[1][0]=0;
	Attendance[1][1]=1;
	Attendance[1][2]=0;
	Attendance[1][3]=1;
	Attendance[1][4]=1;
	Attendance [2][0] = 0;
	Attendance [2][1] = 0;
	Attendance [2][2] = 0;
	Attendance [2][3] = 1;
	Attendance [2][4] = 1;
//	System.out.println(Arrays.deepToString(Attendance));
	highestAt(5,Name,3,Attendance);
}
//	Scanner sc = new Scanner(System.in);
//	int N = sc.nextInt();
//	String[] Name new String[N];
//	for (int i = 0; i < N; i++){
//		Name[i] = sc.next();
//	}
//}int M sc.nextInt();
//
//int[][] Attendance = new int[M] [N];
//
//for(int i=0; i<N; i++) {
//
//for(int j=0; j<N; j++){
//
//Attendance[i][j]=sc.nextInt();
//
//}
//
//}
//
//sc.close();

}