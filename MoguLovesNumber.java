//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/hell-1/
import java.util.*;
		public class MoguLovesNumber{
			public static void main(String[] args){
				int prime[]=new int[100000001];
				for(int i=2;i<100000001;i++)
					if (i%2!=0)
						prime[i]=1;
				for(int i=2;i*i<=100000001;i++){
					if (prime[i]==1)
						for(int j=i*i;j<100000001;j+=i){
							prime[j]=0;
						}
				}
				prime[2]=1;
				for(int i=2;i<1000000001;i++){
					if (prime[i]==1)
						System.out.print(i+ "  ");
				}
				for(int i=2;i<100000001;i++){
					prime[i]+=prime[i-1];
				}
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0){
				int l=sc.nextInt();
				int r=sc.nextInt();
                if (l<=r){
                    System.out.println(prime[r]-prime[l-1]);
                }
                else{
                    System.out.println(prime[l]-prime[r-1]);
                    }
                }
			}
		}
		
	