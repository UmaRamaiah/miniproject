package array;

import java.util.Arrays;

public class Shallowcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]= {1,2,3,4};
			
			int b[]=a;//copy the array
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));
			a[0]++;
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));

	}

}
