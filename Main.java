import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Insertion sort Coremen 2.1-1
		//int [] array={40,20,60,35,70,11,44,22,99};
		/*InsertionSort IS= new InsertionSort();
		IS.insertionSort(array);
		IS.recursiveDriveMethod(array);
		*/
		/*LinearSearch LS=new LinearSearch();
		LS.linearSearch(array, 22);
		System.out.println("\n");
		LS.linearSearchRecursive(array, 1, 0, array.length);
		*/
		/*int [] arr1={1,0,1,1};
		int [] arr2={0,0,1,1};
		AddingTwoBinaryIntegers ABI= new AddingTwoBinaryIntegers();
		ABI.addingBinaryIntegers(arr1, arr2);
		ABI.driveMethodForRecursive(arr1, arr2);
		*/
		/*int [] arr={3,41,52,26,38,57,9,49};
		MergeSort MS=new MergeSort();
		MS.driverMethod(arr);
		//MS.mergeSort(arr, 0, arr.length-1);
		 */
		/*
		int [] array={3,9,26,38,41,49,52,57};
		BinarySearch BS= new BinarySearch();
		BS.binarySearch(array, 57, 0, array.length);
		BS.binarySearchRecursive(array, 57, 0, array.length);
		*/
		/*
		int [] s={3,9,26,38,41,49,52,57};
		GivenXSumPair GXS= new GivenXSumPair();
		GXS.xSumPair(s, 62);
		GXS.XSumPair(s, 44);
		*/
		/*
		int [] array={1,20,6,4,5};
		InversionInAnArray IA=new InversionInAnArray();
		IA.driverMethod(array);
		//int number=IA.mergeSort(array, 0, array.length-1);
		//System.out.println("number of Inversions are : "+number);
		 */
		/*
		int [] array={10,11,7,10,6};
		int [] array1={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int [] array3= {-2, -3, 4, -1, -2, 1, 5, -3};
		int [] empty={};
		MaximumSubArray MS= new MaximumSubArray();
		MS.maximumProfit(array3);
		MS.driverMethod(array3);
		MS.maximumSubArrayLinearTime(array3);
		MS.maximumSubArrayLinearTime1(array3);
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows and columns of First Matrix :");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] M1=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				M1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter number of rows and columns of Second Matrix :");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int[][] M2=new int[p][q];
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				M2[i][j]=sc.nextInt();
			}
		}
		if(n!=p)
		{
			System.out.println("Matrix multiplication is not possible for given Matrices");
			return;
		}
		else
		{
		MatrixMultiplication MM=new MatrixMultiplication();
		MM.naive_Method(M1, M2,m,q);
		}
		
	}

}
