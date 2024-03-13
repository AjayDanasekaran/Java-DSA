package List;

public class ConfusionClass {
	
	public static void main(String[] args) {
		
		int arr[]= {3,2,3,5,7,12,5};
		int index = -1;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==6)
			{
				index =i;
			}
			
		}
		System.out.println(arr[index]);
	}

}
