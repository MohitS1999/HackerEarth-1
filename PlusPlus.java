import java.util.*;
public class PlusPlus{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar[][]=new int[n][m];
		for (int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				ar[i][j]=sc.nextInt();
			}
		}
		int n1;
		//check Even or Odd
		if ((n%2)==0)
		{
			n1=n/2;
		}else{
			n1=(n/2)+1;
		}
		int max=Integer.MIN_VALUE;
		//Matrix
		for (int i1=1; i1<n1; i1++){
		for(int j1=1; j1<m-1; j1++){
		for(int i2=n1; i2<n-1; i2++){
		for(int j2=1; j2<m-1; j2++){
			int sum=((ar[i1-1][j1]*ar[i2-1][j2]) + (ar[i1][j1-1]*ar[i2][j2-1]) + (ar[i1][j1+1]*ar[i2][j2+1]) + 
								(ar[i1+1][j1]*ar[i2+1][j2]) + (ar[i1][j1]*ar[i2][j2]));
					if (max<sum){
						max=sum;
					}
				}
			}
		}
	}
		System.out.println(max);
	}
}	
