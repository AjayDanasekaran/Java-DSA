package SearchingAlgo;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {1,4,6,8,2,5,3,0};
		int target=2;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.println("Element found at index "+i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}
	}
}
