//https://www.hackerearth.com/practice/math/number-theory/totient-function/practice-problems/algorithm/nanachi-and-euler-totient-4-1f3f29ca/
import java.util.*;
public class NanchiAndEuler{
	static long mod = 1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long res=1;
		 for(long i = 1; i * i <= num; i++){
            if(num % i == 0){
                res = ((res % mod) * (phi(i) % mod)) % mod;
				//it will gives us all the values after squareroot(num) mean
				// if we take num=12 then 
				//after sqrt(12):-4,6,12
				//all these value give by this if condition
                if(num / i != i){
                    res = ((res % mod) * (phi(num / i) % mod)) % mod;
					System.out.println("res "+res);
                }
			}
		}
		System.out.println(res%mod);
	}
	static long phi(long n){
		double res=n;
		for(long i=2;i*i<=n;i++){
			if (n%i==0){
				while (n%i==0)
					n/=i;
				res=((res)*(1.0-(1.0/((double)i))));
			}
		}
		if (n>1)
			res=((res)*(1.0-(1.0/((double)n))));
		return (long)res;
	}
}