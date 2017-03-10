/*
 * Author: Anvesh Gangasani
 * Date:Jan-14-2017
 * Complexity: Time O(n) and Space O(n)
 * Implementing the adding two n-bit binary integers, stored in two n-element arrays A and B.using Iterative and recursive methods.
 * CLRS 2.1-4
 */
public class AddingTwoBinaryIntegers {
	public void addingBinaryIntegers(int[] arr1,int[] arr2)
	{
		int carry=0;
		int i=arr1.length-1;
		int [] c=new int[arr1.length+1];
		while(i>=0 )
		{
			c[i+1]=(arr1[i]+arr2[i]+carry)%2;
			carry=(arr1[i]+arr2[i]+carry)/2;
			i--;
		}
		c[i+1]=carry;
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]);
		}
	}
	public void addingBinaryIntegersRecursive(int[] arr1,int[] arr2,int start,int[] c,int carry)
	{
		if(start<0)
		{
			c[start+1]=carry;
			return;
		}
	
		else
		{
			c[start+1]=(arr1[start]+arr2[start]+carry)%2;
			carry=(arr1[start]+arr2[start]+carry)/2;
			addingBinaryIntegersRecursive(arr1,arr2,start-1,c,carry);
		}
	}
	public void driveMethodForRecursive(int[] arr1,int[] arr2)
	{
		int carry=0;
		int start=arr1.length-1;
		int [] c=new int[arr1.length+1];
		addingBinaryIntegersRecursive(arr1,arr2,start,c,carry);
		System.out.print("\n");
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]);
		}
	}

}
