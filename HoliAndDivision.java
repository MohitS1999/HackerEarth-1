import java.util.*;
public class HoliAndDivision{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//TestCases
		while (t-->0){
			int n=sc.nextInt();
			int ar[]= new int[n];
			for(int i=0;i<n;i++)
				ar[i]=sc.nextInt();
			long ans=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					ans+=div(ar[i],ar[j]);
				}
			}
			System.out.println(ans);
		}
	}
	//If Decimal part of n is >=0.5 we take ceil of n else we take floor of n.
	static int div(int a,int b){
		double d=(double)a/b;
		if ((d-(a/b))>=0.5)
			return (a/b)+1;
		else
			return a/b;
	}
}
