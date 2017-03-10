/*
 * Author: Anvesh Gangasani
 * Date:Jan-15-2017
 * Complexity: Time O(n2) &O(nlogn) and Space O(1)
 * Implementing Maximum-Subarray problem
 * CLRS -4.1-2,4.1-3,4.1-4
 */

public class MaximumSubArray {
	
	class SubArray{
		int left_Index;
		int right_Index;
		int sum;
		public SubArray(int left_Index,int right_Index,int sum)
		{
			this.left_Index=left_Index;
			this.right_Index=right_Index;
			this.sum=sum;
		}
		public SubArray()
		{
			
		}
	}
	
		
	public void maximumProfit(int [] array)
	{
		int max_sum=Integer.MIN_VALUE;
		int left_index=0,right_index=0;
		for(int i=0;i<array.length;i++)
		{
			int current_sum=0;
			for(int j=i;j<array.length;j++)
			{
				current_sum +=array[j];
				if(current_sum >max_sum)
				{
					max_sum=current_sum;
					left_index=i;
					right_index=j;
				}
			}
		}
		for(int j=left_index;j<=right_index;j++)
		{
			System.out.print(array[j]+" ");
		}
		System.out.print("\n");
		System.out.println("Maximum Profit is : "+max_sum);
	}
	public SubArray crossMaximumSubArray(int [] array,int left,int mid,int right)
	{
		int left_index=0,right_index=0;
		int sum=0,left_sum=Integer.MIN_VALUE,right_sum=Integer.MIN_VALUE;
		for(int i=mid;i>=left;i--)
		{
		sum+=array[i];
		if(left_sum<sum)
		{
			left_sum=sum;
			left_index=i;
		}
		}
		sum=0;
		for(int j=mid+1;j<=right;j++)
		{
		sum+=array[j];
		if(right_sum<sum)
		{
			right_sum=sum;
			right_index=j;
		}
		
		}
		if(left_sum+right_sum<0)
		{
			SubArray empty=new SubArray(mid,mid,0);
			return empty;
		}
		else
		{
			SubArray cross=new SubArray(left_index,right_index,left_sum+right_sum);
			return cross;
		}
		
	}
	
		
	public SubArray maximumSubArray(int [] array,int left,int right)
	{
		
		if(left==right)
		{
			if(array[left]==0)
			{
				SubArray empty= new SubArray(left,left,0);
				return empty;
			}
			else
			{
				SubArray result= new SubArray(left,right,array[left]);
				return result;	
			}
			
		}
		else
		{
			int mid=left+(right-left)/2;
			SubArray left_array,right_array,cross_array=new SubArray();
			left_array=maximumSubArray(array,left,mid);
			right_array=maximumSubArray(array,mid+1,right);
			cross_array=crossMaximumSubArray(array,left,mid,right);
			if(left_array.sum>right_array.sum && left_array.sum>cross_array.sum)
			{
				return left_array;
			}
			else if(right_array.sum>left_array.sum && right_array.sum>cross_array.sum){
				return right_array;
			}
			else
			{
				return cross_array;
			}
			
		}
		
	}
	public void driverMethod(int [] array)
	{
		int left=0,right=0;
		if(array.length==0)
		{
			left=0;
			right=0;
		}
		else
		{
			left=0;
			right=array.length-1;
		}
		
		SubArray result=new SubArray();
		result=maximumSubArray(array,left,right);
		System.out.println("Maximum Sum is: "+result.sum);
		System.out.print("Sub-array is : ");
		for(int i=result.left_Index;i<=result.right_Index;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public void maximumSubArrayLinearTime(int [] array)
	{
		int current_sum=array[0],final_sum=array[0];
		int i=1,n=array.length-1;
		while(i<=n)
		{
			current_sum+=array[i];
			current_sum=Math.max(current_sum, array[i]);
			final_sum=Math.max(final_sum, current_sum);
			i++;
			
		}
		System.out.println("Maximum Sub Array sum is: "+final_sum);
	}
	public void maximumSubArrayLinearTime1(int [] array)
	{
		int current_sum=array[0],final_sum=array[0];
		int i=1,n=array.length-1,nstart=0,nend=0,start=0,end=0;
		while(i<=n)
		{
			if(current_sum+array[i]<array[i])
			{
				current_sum=array[i];
				nstart=i;
				nend=i;
			}
			else
			{
				current_sum+=array[i];
				nend=i;
			}
			if(final_sum<current_sum)
			{
				final_sum=current_sum;
				start=nstart;
				end=nend;
			}
			i++;
			
		}
		System.out.println("Maximum Sub-Array sum is: "+final_sum);
		System.out.print("Sub-array is : ");
		for(int j=start;j<=end;j++)
		{
			System.out.print(array[j]+" ");
		}
	}

}
