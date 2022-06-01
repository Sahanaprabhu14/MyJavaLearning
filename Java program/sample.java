import java.*

class Queen
{
	public static int N;
	public static int[][] board= new int[100][100];
	private static boolean isAttack(int i, int j)
	{
		int k,l;
		//checking for rows and columns
		for(k=0; k<N; k++)
			if((board[i][k]==1) || board[k][j]==1)
				return true;
	}
	//checking for diagonals
	for(k=0; k<N; k++)
	{
		for(l=0; l<N; l++)
		{
			if(((k+l)==(i+j)) || ((k-l)==(i-j)))
			{
				if(board[k][l]==1)
					return true;
			}		
		}
	}
	return false;
}

import java.*
class Queen {
	public static int N;
	public static int[][] board= new int[100][100];
	private static boolean isAttack(int i, int j)
	{
		int k,l;
		for(k=0; k<N; k++)
			if((board[i][k]==1) || board[k][j])
				return true;
	}
	for(k=0; k<N; k++)
	{
	for(l=0; l<N; )
	}
}