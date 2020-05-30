import java.util.*;
public class SetNumber{
	public static void main(String[] args){
		long gp[]=new long[31];
		gp[0]=0;
		gp[1]=1; 
		for(int i=2;i<=30;i++)
			gp[i]=2*gp[i-1];
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			int l=decToBin(n);
			System.out.println(gp[l]-1);
		}
	}
	//Convert Decimal To Binary
	static int decToBin(long n){
		long rem=1;
		int l=0;
		int flag=0;
		while(n>0){
			rem=n%2;
			if (rem==0)
				flag=1;
			l++;
			n/=2;
		}
		if (flag==1)
			return l;
		else
			return l+1;
	}
}
