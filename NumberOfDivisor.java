import java.util.*;
public class NumberOfDivisor{
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			long k=sc.nextLong();
			long sum=0;
			for(long i=1;i<=n;i++){
				for (long j=i;j>0;j--){
					if (i%j==0 && j%k!=0){
						sum+=j;
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
/*
i/p:-10 3 o/p:-41
i/p:-10 2 o/p:-36
i/p:-10 5 o/p:-43

Explanation 
In the first test case, f (x) from 1 to 10 is [1, 2, 1, 4, 5, 2, 7, 8, 1, 10], sum of which is 41.
In the second test case, f (x) from 1 to 10 is [1, 1, 3, 1, 5, 3, 7, 1, 9, 5].
In the third test case, f (x) from 1 to 10 is [1, 2, 3, 4, 1, 6, 7, 8, 9, 2].
*/
