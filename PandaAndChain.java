import java.util.*;
	public class PandaAndChain{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			final int mod=1000003;
			long ar[]=new long[mod];
			ar[0]=1 	;
			ar[1]=1;
			for (int i=2;i<mod;i++){
				ar[i]=(((ar[i-1]%mod)*(i%mod))%mod);
			}
			int t=sc.nextInt();
			while(t-->0){
				long n=sc.nextLong();
				long x=sc.nextLong();
				if (n>mod)
					System.out.println("0");
				else
					System.out.println(((x%1000003)*(ar[(int)n%1000003]))%mod);			
			}
		}
	}