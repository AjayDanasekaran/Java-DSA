package ArrayProgramming;
public class ArraysEx {
	public static void main(String[] args) {
		Array a = new Array();
//		a.arrayDemo();
//		a.multiArr();
//		a.arrDemo();
		a.arrsum();
	}
}
class Array{
	void arrayDemo(){
		int age[] = new int[3]; //ages[0]=11 ages[1]=22 ages[2]=33 4 bytes * 3 = 12 bytes
//		float weight[] = new float[4];
		String names[] = {"ajay","ujwal","adi","akash"};
		
		age[0]=11;
		age[1]=22;
		age[2]=33;
		
//		System.out.println(names[2]);
		
//		System.out.println(age.length);
		
//		for(int i=0;i<age.length;i++) { //0,1,2
//			System.out.print(age[i]+" ");
//		}
		
//		for(int i:age) { //foreach
//			System.out.println(i);
//		}
		
//		int i =0;
//		while(i<age.length) {
//			System.out.println(age[i]);
//			i++;
//		}
		
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
	}
	void multiArr(){
//		int [][]arr_1 = new int[3][5];
		int [][]arr_2 = {{23,24},{33,34},{44,54}};
		for(int i=0;i<arr_2.length;i++) {
			for(int j=0;j<arr_2[i].length;j++) {
			System.out.println(arr_2[i][j]);
			}
		}

		
		
		
		
//		int [][] arr_4 = new int[3][2];
//		int[][][]arr_3= new int[5][3][2];
//		arr_3[0][0][0]=3;
//		System.out.println(arr_3[0][0][0]);
	}
	void arrDemo() {
		int[][] array = new int[4][4];
		 
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = value;
                value++;
            }
        }
 
        System.out.println("The 2D array is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	void arrsum() {
		int arr[] = new int[4]; 
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 9;
		
		
// sum of an array
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println(sum);
		
// max of an array
		int arr_1[] = {5,3,6,2,8,1};
//		int max = 0;
//		for(int i=0;i<arr_1.length;i++) {
//			if(max<arr_1[i]) {
//				max = arr_1[i];
//			}
//		}
//		System.out.println(max);

//index of matched element
		int x = 31;
		int ans=-1;
		for(int i=0;i<arr_1.length;i++) {
		if(x==arr_1[i]) {
			ans = i;
			break;
		}
		}
		System.out.println(ans);
	}
}
