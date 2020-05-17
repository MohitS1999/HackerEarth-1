import java.util.*;
public class FactorialEquation{
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long n=sc.nextLong();
		if (n>4){
			System.out.println(x%10);
		}
		else{
			int fac[]=new int[5];
			fac[0]=1;
			for(int i=1;i<5;i++)
				fac[i]=i*fac[i-1];
			long m=fac[(int)n]%10;
			System.out.println("dsd "+m);
			System.out.println("pow "+pow(x,m));
			System.out.println(pow(x%10,m)%10);
		}
		System.out.println(pow(x,factmod(n)));
	}
	static long pow(long n,long p){
		long res=1;
		while(p>0){
			if ((p&1)==1)
				res=res*n;
			p=p/2;
			n=n*n;
		}
		return res;
	}
}
	
	
