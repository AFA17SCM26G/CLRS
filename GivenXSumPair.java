/*
 * Author: Anvesh Gangasani
 * Date:Jan-15-2017
 * Complexity: Time O(nlogn) and Space O(1)
 * Describe a ‚.n lg n/-time algorithm that, given a set S of n integers and another integer x, 
 * determines whether or not there exist two elements in S whose sum is exactly x.
 * CLRS 2.3-7
 */
public class GivenXSumPair {
	public void xSumPair(int [] s,int x)
	{
		int start=0;
		int end=s.length-1;
		while(start<end)
		{
			if(binarySearch(s,Math.abs(x-s[start]),start+1,end)==true)
			{
				System.out.println("Given X sum pair is found");
				return;
			}
			else
			{
				start++;
			}
		}
		System.out.println("Given X sum pair is not found");
		
	}
	public boolean binarySearch(int [] array, int key,int start,int end)
	{
		if(start<=end)
		{
			int mid=start+(end-start)/2;
			if(array[mid]==key)
			{
				return true;
			}
			else if (array[mid]>key)
			{
				return binarySearch(array,key,start,mid-1);
				 
				
			}
			else
			{
				return binarySearch(array,key,mid+1,end);
			}
			
		}
		return false;
		
	}
	/*
	 * Author: Anvesh Gangasani
	 * Date:Jan-15-2017
	 * Complexity: Time O(n) and Space O(1)
	 * Describe a ‚.n -time algorithm that, given a set S of n integers and another integer x, 
	 * determines whether or not there exist two elements in S whose sum is exactly x.
	 * CLRS 2.3-7
	 */
	public void XSumPair(int [] s,int x)
	{
		int i=0,j=s.length-1;
		while(i<j)
		{
			if(s[i]+s[j]==x)
			{
				System.out.println("Given X sum pair is found");
				return;
			}
			else if(s[i]+s[j]>x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.println("Given X sum pair is not found");
	}

}
