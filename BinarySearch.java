/*
 * Author: Anvesh Gangasani
 * Date:Jan-15-2017
 * Complexity: Time O(logn) and Space O(1)
 * Implementing the Binary Search using iterative & recursion
 * CLRS 2.3-5
 */
public class BinarySearch {
	public void binarySearch(int [] array, int key,int start,int end)
	{
		if(start<=end)
		{
			int mid=start+(end-start)/2;
			if(array[mid]==key)
			{
				System.out.println("the element "+array[mid]+" is found at :"+mid);
				return;
			}
			else if (array[mid]>key)
			{
				 binarySearch(array,key,start,mid-1);
				 return;
				
			}
			else
			{
				binarySearch(array,key,mid+1,end);
				return;
			}
			
		}
		System.out.println("the element is not found in given array");
		
	}
	public void binarySearchRecursive(int [] array,int key,int start,int end)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(array[mid]==key)
			{
				System.out.println("the element "+array[mid]+" is found at :"+mid);
				return;
			}
			else if(array[mid]<key)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		System.out.println("the element is not found in given array");
	}

}
