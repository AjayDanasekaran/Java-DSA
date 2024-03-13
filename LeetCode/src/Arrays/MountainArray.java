package Arrays;

public class MountainArray {
	public static void main(String[] args) {
		int arr[] = {2,0,2};
		System.out.println(mount(arr));
	}
	public static boolean mount(int[] arr) {
	    if (arr.length < 3) {
	        return false;
	    }
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] > arr[i + 1] && arr[arr.length - i - 2] > arr[arr.length - i - 1]) {
	            return true;
	        }
	    }
	    return false;
	}

}
