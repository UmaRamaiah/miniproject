package array;

public class SmallestArray {

	
	public static void main(String[] args) {
	    int a[] = {12, 7, 4, 5, 23};
	    int s = a[0];

	    for (int i = 0; i < a.length; i++) {
	        if (s > a[i]) 
	            s = a[i];
	        
	    }

	    System.out.println(s);
	}
}



