import java.util.*;
public class TrystWithChess{
	static int count=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int chess[][]=new int[10][10];
		int i=sc.nextInt();
		int j=sc.nextInt();
		int move=sc.nextInt();
		position(i,j,chess,move);
		System.out.println(count);
		for( int x=0;x<10;x++){
			for(int y=0;y<10;y++){
				System.out.print(chess[x][y]+" ");
			} 
			System.out.println();
		}
	}
	static void position(int x,int y,int[][] chess,int move){
		if (x<0||x>9||y<0||y>9)
			return;
		if (move==0){
			if (chess[x][y]==0){
				chess[x][y]=1;
				count++;
			}
		}
		if (move<0)
			return;
		//moves of chess
		position(x-2,y-1,chess,move-1);
		position(x-1,y-2,chess,move-1);
		position(x-2,y+1,chess,move-1);
		position(x+2,y+1,chess,move-1);
		position(x+2,y-1,chess,move-1);
		position(x-1,y+2,chess,move-1);
		position(x+1,y+2,chess,move-1);
		position(x+1,y-2,chess,move-1);
		
	}
}
