import java.util.*;
public class Hawkeye{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i=sc.nextInt();
		int j=sc.nextInt();
		int p=sc.nextInt();
		arr[i][j]=p;
		p--;
		for(int k=1;k<n;k++){

			for(int x=i-k;x<=i+k;x++){
				for(int y=j-k;y<=j+k;y++){
					if(x>-1 && y>-1 && x<n && y<n && arr[x][y]==0)
						arr[x][y]=p;
				}
			}
			if (p>0)
				p--;
		}
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}
