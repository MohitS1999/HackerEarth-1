//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/selection-of-cities-2/
import java.util.*;
public class SelectionOfCities{
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			System.out.println(pow(2,n)-1);
		}
	}
	// find power(x,y) in log(x) times
	static long pow(long a,long b){
		long res=1;
		while (b>0){
			if (b%2!=0)
				res=((res%mod)*(a%mod))%mod;
			b/=2;
			a=((a%mod)*(a%mod))%mod;
		}
		return res%mod;
	}
}
