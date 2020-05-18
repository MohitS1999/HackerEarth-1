import java.util.*;
public class GreatKian{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		//Input
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<3;i++){
			long sum=0;
			for(int j=i;j<n;j=j+3){
				sum+=arr[j];
			}
			System.out.print(sum+" ");
		}
	}
}
