//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/tic-tac-toe-thingy-7ce8b17b
	import java.util.*;
	public class TicTacToe{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			char ch[][]=new char[3][3];
			int lenx=0;
			int leno=0;
			for (int i=0;i<3;i++){
				String s=sc.next();
				for (int j=0;j<s.length	();j++){
					ch[i][j]=s.charAt(j);
					if (ch[i][j]=='O')
						leno++;
					if (ch[i][j]=='X')
						lenx++;
				}
			}
	
			//if the length of O is greater than length Of X then this is invalid Condition BCOZ game always strt with 'X'
			//if the length of X is greater then leno+1 mean it X runs 2 times extra then O i.e Invalid Condition
			if (leno>lenx ||lenx>leno+1)
				System.out.println("Wait, what?");
			else{
				boolean flag=false;
			
				//if X is find in ROW
				for(int i=0;i<3;i++){
					int j=0;
					if (ch[i][j]=='X' && ch[i][j+1]=='X' && ch[i][j+2]=='X')
					{
						//If len(x)==len(O) mean O play also after win the X i.e INVALID
						if (leno==lenx){
							System.out.println("Wait, what?");
							flag=true;
							break;
						}
						//X WON
						else{
						System.out.println("X won.");
						flag=true;
						break;
						}
					}
				}
				//if O is find in ROW
				if (!flag){
				for(int i=0;i<3;i++){
						int j=0;
						if(ch[i][j]=='O' && ch[i][j+1]=='O' && ch[i][j+2]=='O'){
							System.out.println("O won.");
							flag=true;
							break;
						}
					}
				}
				//if X is find in COLUMN
				if (!flag){
					for(int i=0;i<3;i++){
						int j=0;
						if (ch[j][i]=='X' && ch[j+1][i]=='X' && ch[j+2][i]=='X')
						{
							//AS SAme AS ABOVE in ROW
							 if (leno==lenx){
							System.out.println("Wait, what?");
							flag=true;
							break;
						}
						else
						{
							System.out.println("X won.");
							flag=true;
							break;
						}
						}
					}
				}
				//if O is find in ROW
				if (!flag){
					for(int i=0;i<3;i++){
						int j=0;
						if (ch[j][i]=='O' && ch[j+1][i]=='O' && ch[j+2][i]=='O')
						{  
							//only whenever the len(O)==len(X) bCZ this is valid condition
							if (leno==lenx){
								System.out.println("O won.");
								flag=true;
								break;
                            }
							else
							{
                                System.out.println("Wait, what?");
								flag=true;
								break;
                            }
						}
					}
				}
				//if X is find in antidiagonal matrix
				if (ch[0][2]=='X' && ch[1][1]=='X' && ch[2][0]=='X' &&!flag){
					  if (leno==lenx){
							System.out.println("Wait, what?");
							flag=true;
						}else{
						System.out.println("X won.");
						flag=true;
						}
				}
				//if O is find in antidiagonal matrix
				if (ch[0][2]=='O' && ch[1][1]=='O' && ch[2][0]=='O' &&!flag && leno==lenx){
					System.out.println("O won.");
					flag=true;
				}
				//if X is find in diagonal matrix
				if (ch[0][0]=='X' && ch[1][1]=='X' && ch[2][2]=='X' &&!flag){
					System.out.println("X won.");
					flag=true;
				}
				//if O is find in diagonal matrix
				if (ch[0][0]=='O' && ch[1][1]=='O' && ch[2][2]=='O' &&!flag && leno==lenx){
					System.out.println("O won.");
					flag=true;
				}
				//if the X and O is play whole game but no one wins then game is draw
				if (leno+lenx==9 && !flag){
						System.out.println("It's a draw.");
						flag=true;
				}
				//if game is not complete and no one is win
				if (!flag){
					if (lenx>leno)
						System.out.println("O's turn.");
					else if(lenx==leno)
						System.out.println("X's turn.");
				}
			}
		}
	}