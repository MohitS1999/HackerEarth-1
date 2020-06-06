import java.util.*;
public class HelpOz{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int ar[]=new int[m];
		int max=Integer.MIN_VALUE;
		for (int i=0;i<m;i++){
			int n=sc.nextInt();
			ar[i]=n;
			if (max<n)
				max=n;
		}
		for (int k=2;k<=max;k++){
			boolean flag=true;
			for (int i=0;i<m-1;i++){
				if (ar[i]%k!=ar[i+1]%k)
				{
					flag=false;
					break;
				}
			}
			if (flag)
				System.out.print(k+" ");
		}
	}
}
