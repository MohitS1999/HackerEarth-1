import java.util.*;
public class NearestPrime{
	public static void main(String[] args){
		final int limit=2*1000001;
		//find prime number upto limit
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
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int i=n;
			int j=n;
			int flag =0;
			while(true){
				if (prime[i--]==1){
					flag=1;
					break;
				}
				if (prime[j++]==1){
					flag=2;
					break;
				}
			}
			if (flag==1)
				System.out.println(i+1);
			else if (flag==2)
				System.out.println(j-1);
		}
	}
}
