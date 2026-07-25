/*
Topic: Creation of Array
Definition: An array stores a fixed-size ordered group of values of the same type.
Why / usage: It provides indexed storage and fast access by position.
Where to use it: Use arrays for fixed-size data, tables, matrices, and simple sequences.
*/
public class Demo {
	public static void main(String[] args) {
//      int nums[]= {3,7,2,4};
//		nums[1]=6;
//		System.out.println(nums[1]);
		
		int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		
	}
}