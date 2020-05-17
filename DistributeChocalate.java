import java.util.*;
class DistributeChocalate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long c=sc.nextLong();
			long n=sc.nextLong();
			long total=n*(n+1)/2;
			long sol=c-total;
			if (sol>0){
				System.out.println(sol%n);
			}
			else{
				System.out.println(c);
			}
		}
	}
}	