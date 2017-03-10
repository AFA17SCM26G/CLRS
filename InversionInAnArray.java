/*
 * Author: Anvesh Gangasani
 * Date:Jan-22-2017
 * Complexity: Time O(nlogn) and Space O(n)
 * Implementing the function to find the Inversions in a given array.
 * CLRS 2.4
 */
public class InversionInAnArray {
	public int  merger(int [] array,int start,int mid,int end)
	{
		int n1=mid-start+1;
		int n2=end-mid;
		int i=0,j=0,k=start,num_Inversions=0;
		int [] left_Array=new int[n1];
		int [] right_Array=new int[n2];
		for(int m=0;m<n1;m++)
		{
			left_Array[m]=array[start+m];
		}
		for(int n=0;n<n2;n++)
		{
			right_Array[n]=array[mid+1+n];
		}
		
		while(i<n1 &&j<n2)
		{
			if(left_Array[i]<= right_Array[j])
			{
				array[k]=left_Array[i];
				i++;
			}
			else 
			{
				array[k]=right_Array[j];
				num_Inversions+=n1-i;
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			array[k]=left_Array[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			array[k]=right_Array[j];
			k++;
			j++;
		}
		return num_Inversions;
	}
	public int mergeSort(int [] array,int start,int end)
	{
		
		if(start<end)
		{
			int inversions=0;
			int mid=start+(end-start)/2;
			inversions=mergeSort(array,start,mid);
			inversions+=mergeSort(array,mid+1,end);
			inversions+=merger(array,start,mid,end);
			return inversions;
		}
		else
			return 0;
		
	}
	public void driverMethod(int [] array)
	{
		int start=0,end=array.length-1;
		int number=mergeSort(array,start,end);
		System.out.println("number of Inversions are : "+number);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
