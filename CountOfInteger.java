//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-2/practice-problems/algorithm/too-much-to-count-fb914aed/
import java.util.*;
public class CountOfInteger{
	public static void main(String[] agr){
		final int limit=2*1000001;
		int prime[]=new int[limit];
		for (int i=2;i<limit;i++){
			if (i%2!=0)
				prime[i]=1;
		}
		for (int i=2;i*i<limit;i++){
			if (prime[i]==1){
				for(int j=i*i;j<limit;j+=i){
					prime[j]=0;
				}
			}
		}
		prime[2]=1;
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int cnt=0;
			if (prime[n]==1){
				sb.append(cnt+"\n");
			}else{
				for(int k=4;k<n;k++){
					if (prime[k]!=1){
						int GCD=gcd(k,n);
						if ((GCD!=1)&&(GCD!=k)){
							cnt++;
							//sb.append(k+" "+n+"  :-  "+GCD+"\n");
						}
					}
				}
				sb.append(cnt+"\n");
			}
		}
		System.out.println(sb);
	}
	public static int gcd(int a,int b){
		//System.out.print(a+" , "+b+"   "); 
		if (b==0)
			return a;
		//it recursively give the b,a%b
		
		return gcd(b,a%b);
	}
}