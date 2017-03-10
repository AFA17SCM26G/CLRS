/*
 * Author: Anvesh Gangasani
 * Date:Jan-15-2017
 * Complexity: Time O(nlogn) and Space O(n)
 * Implementing the Merge sort using iterative & recursion
 * CLRS 2.3-1
 */
public class MergeSort {
	public void merger(int [] arr,int start,int mid,int end)
	{
		//System.out.println(start+" "+mid+" "+end);
		int n1=mid-start+1;
		int n2=end-mid;
		int [] array_L=new int [n1];
		int [] array_R=new int[n2];
		int i=0,j=0;
		while(i<n1)
		{
			array_L[i]=arr[start+i];
			i++;
		}
		while(j<n2)
		{
			array_R[j]=arr[mid+1+j];
			j++;
		}
		int k=start,l=0,m=0;
		while(l<n1 && m<n2)
		{
			if(array_L[l]<=array_R[m])
			{
				arr[k]=array_L[l];
				l++;
			}
			else
			{
				arr[k]=array_R[m];
				m++;
			}
			k++;
		}
		while(l<n1)
		{
			arr[k]=array_L[l];
			l++;
			k++;
		}
		while(m<n2)
		{
			arr[k]=array_R[m];
			m++;
			k++;
		}
		
	}
	public void mergeSort(int [] arr,int start,int end)
	{
		if(start<end)
		{
			int mid=start+(end-start)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merger(arr,start,mid,end);
			
		}

	}
	void driverMethod(int[] arr)
	{
		mergeSort(arr,0,arr.length-1);
		mergeSortIterative(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void mergeSortIterative(int [] arr,int start,int end)
	{
		int current_size=1,left_start=start;
		while(current_size<=end)
		{
			while(left_start<end)
			{
				int mid=left_start+current_size-1;
				int right_end=Math.min(left_start+2*current_size-1, end);
				merger(arr,left_start,mid,right_end);
				System.out.println(left_start+" "+mid+" "+right_end);
				left_start=left_start+2*current_size;
				
			}
			left_start=start;
			current_size=2*current_size;
				
		}
		
	}
}


