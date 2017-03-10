/*
 * Author: Anvesh Gangasani
 * Date:Jan-14-2017
 * Complexity: Time O(n2) and Space O(1)
 * Implementing the Insertion sort using iterative & recursion
 * CLRS 2.1-1
 */
public class InsertionSort {
	public void insertionSort(int [] array)
	{
		int n=array.length,i=1,j=0;
		while(i<n)
		{
			while(j<i)
			{
				if(array[j] >array[i])
				{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
				j++;
			}
			j=0;
			i++;
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(array[k]+" ");
		}
	}
	public void insertionSortRecursive(int [] array,int start,int end)
	{
		if(start > end-1)
		{
			return;
		}
		int j=0;
		while(j<start)
		{
			if(array[j]>array[start])
			{
				int temp=array[j];
				array[j]=array[start];
				array[start]=temp;
			}
			j++;
		}
		insertionSortRecursive(array,start+1,end);
		
	}
	public void recursiveDriveMethod(int [] array)
	{
		int start=1;
		int end=array.length;
		insertionSortRecursive(array,start,end);
		System.out.println("\n");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
