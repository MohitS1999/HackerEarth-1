import java.util.*;
public class ArrayInsert{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr[]=new int[n1];
		for(int i=0;i<n1;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n2;i++){
			int s=sc.nextInt();
			switch(s){
				case 1: int x=sc.nextInt();
						int y=sc.nextInt();
						arr[x]=y;
						break;
				case 2: int l=sc.nextInt();
						int r=sc.nextInt();
						int sum=0;
						for(int index=l;index<=r;index++){
							sum+=arr[index];
						}
						System.out.println(sum);
						break;
			}
		}
	}
}