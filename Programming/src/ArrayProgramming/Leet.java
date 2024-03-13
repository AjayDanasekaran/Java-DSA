package ArrayProgramming;
import java.util.*;
public class Leet {
	public static void main(String[] args) {
		Integer [] arr = {1,1};
		ArrayList<Integer> al= new ArrayList();
		for(int i : arr) {
			al.add(i);
		}
		System.out.println("Initilly : "+al);
		 boolean hi = true;
		 for (int i = 0; i < al.size() - 1; i++) {
			    if (al.get(i) < al.get(i + 1)) {
			        continue;
			    }
			    else {
			    	if (al.get(i) >= al.get(i + 1)) {
			    		int indexToRemove = i;
				        int removedItem = al.remove(i);
				        if(increasing(al)) {
				        	break;}
				        else {
				        	al.add(indexToRemove, removedItem);
				        	al.remove(i+1);
				        }
			        }
			    }
			}

	     System.out.println("after : "+al);
	     System.out.println(increasing(al));
	}
	public static boolean increasing(ArrayList<Integer> a) {
		   boolean hi=true;
		   for(int i=0;i<a.size()-1;i++){
		         if(a.get(i)>=a.get(i+1)){
		             hi=false;
		             break;
		         }
		     }
		   return hi;
	   }
}
