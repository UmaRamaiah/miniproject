package array;



public class ArrayExample2 {

	public static void main(String[] args) {
		
		
		 //Initialize array  
        int arr[] = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 1; i < 5; i++) 
        {  
          
        	
        	//Compare elements of array with max  
           if(arr[i] > max) // 11>25,7>25,75>25 
               max = arr[i];  
        }
        
        
        System.out.println("Largest element present in given array: " + max);  
        
    }  
		
	}

		