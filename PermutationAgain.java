//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/permutation-again/
import java.util.*;
public class PermutationAgain{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long ar[]=new long[100001];
		ar[0]=1;
		ar[1]=1;
		ar[2]=1;
		ar[3]=3;
		long x=4;
		int k=0;
		for(int i=4;i<100001;i++){
			ar[i]=ar[i-1]+x;
			k++;
			if (k==2)
			{
				k=0;
				x+=2;
			}
		}
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(ar[n]);
        }
    }
}