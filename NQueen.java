//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/n-queensrecursion-tutorial/submissions/
import java.util.*;
public class NQueen{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int board[][]=new int[n][n];
            if (n>3 || n==1)
			    nQueen(board,0,n);
            else
                System.out.println("Not possible");
		
	}
	public static boolean nQueen(int board[][],int i,int n){
		if (i==n){
				for (int x=0;x<n;x++){
					for (int y=0;y<n;y++)
					{
						System.out.print(board[x][y]+" ");
					}
					System.out.println();
				}
				return true;
		}
		
		for (int j=0;j<n;j++){
			
			//i hav to check i,j is right postion or not
			if (isSafe(board,i,j,n))
			{
				//place the queen assume i,j is right position
				board[i][j]=1;
				
				boolean nextQueen=nQueen(board,i+1,n);
				if (nextQueen)
					return true;
			}
			//means i,j is not right position
			System.out.println(i+" "+j);
			board[i][j]=0;//backtrack
		}
		return false;
	}
	public static boolean isSafe(int board[][],int i,int j,int n){
		int x=i;
		int y=j;
		//for column
		while (x>=0){
			if (board[x][y]==1)
				return false;
			x--;
		}
		//for right diagonal
		x=i;
		y=j;
		while (x>=0 && y<n)
		{
			if (board[x][y]==1)
				return false;
			x--;
			y++;
		}
		//for left diagonal
		x=i;
		y=j;
		while (x>=0 && y>=0)
		{
			if (board[x][y]==1)
				return false;
			x--;
			y--;
		}
		//if board is safe
		return true;
	}
}