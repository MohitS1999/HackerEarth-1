import java.util.*;
public class RainSound{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int l=sc.nextInt();
			int r=sc.nextInt();
			int s=sc.nextInt();
			int max=-1;
			int min=-1;
			int flag=0;
			int i=l;
			while(i<=r && s<=r){
				if (i%s==0){
					min=i/s;
					break;
				}
				i++;
			}
			int j=r;
			while(j>=l && s<=r){
				if (i%s==0){
					max=j/s;
					break;
				}
			}
			System.out.println(min+" "+max);
		}
	}
}