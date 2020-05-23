//https://www.geeksforgeeks.org/divide-array-k-segments-maximize-maximum-segment-minimums/
import java.util.*;
public class NumberOfArrays{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int q=sc.nextInt();
			//max initialize with Minimum value
			//min initialize with Maximum value
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			int arr[]=new int[n];
			for( int i=0; i<n ;i++){
				arr[i]=sc.nextInt();
				max=Math.max(arr[i],max);
				min=Math.min(arr[i],min);
			}
			int ans=0;
			if ( k==1 ){
				ans=max;
			}else{
				ans=min;
			}
			if (ans<q)
				System.out.println(ans);
			else
				System.out.println("NO");
		}
	}
}
