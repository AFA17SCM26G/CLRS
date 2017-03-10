/*
 * Author: Anvesh Gangasani
 * Date:Jan-14-2017
 * Complexity: Time O(n) and Space O(1)
 * Implementing the Linear Search using iterative & recursion 
 * CLRS 2.1-3
 */
public class LinearSearch {
	public void linearSearch(int [] array,int key)
	{
		int n=array.length,i=0;
		while(i<n)
		{
			if(array[i]==key)
			{
				System.out.print("The element is found at: "+ i);
				return ;
			}
			else
			{
				i++;
			}
				
		}
		System.out.print("The element is not found in given array");
	}
	
	public void linearSearchRecursive(int [] array,int key,int start,int end)
	{
		if(start>end-1)
		{
			System.out.print("The element is not found in given array");
			return;
		}
		else if(array[start]==key)
		{
			System.out.println("The element is found at: "+ start);
			return;
		}
		else
		{
			linearSearchRecursive(array,key,start+1,end);
			
		}
	}
}


