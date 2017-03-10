
public class MatrixMultiplication {
	public void naive_Method(int[][] M1,int[][] M2,int m,int q)
	{
		int[][] C=new int [m][q];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				 C[i][j]=0;
				 for(int k=0;k<q;k++)
				 {
					 C[i][j]=C[i][j]+M1[i][k]*M2[k][j];
				 }
			}
		}
		for(int i=0;i<m ;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
