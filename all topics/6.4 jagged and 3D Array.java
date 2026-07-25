/*
Topic: jagged and 3D Array
Definition: An array stores a fixed-size ordered group of values of the same type.
Why / usage: It provides indexed storage and fast access by position.
Where to use it: Use arrays for fixed-size data, tables, matrices, and simple sequences.
*/
public class Demo {
	public static void main(String[] args) 
	{
//		int nums[][]=new int [3][]; //jagged
//		nums[0]=new int [3];
//		nums[1]=new int [4];
//		nums[2]=new int [2];
		
		int nums[][]=new int [3][4];
//		int nums[][]=new int [3][4][5]; // three dimensional
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
			}
		}
	}
}