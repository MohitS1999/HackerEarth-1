//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/its-confidential-f006e2c4/
import java.util.*;
public class ItsConfidential{
	static StringBuffer sb=new StringBuffer();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			mid(s,0,n-1);
			
			System.out.println();
		}
	}
	public static void mid(String s,int start,int end){
		if (start<=end){
			
			int mid=(start+end)/2;
			System.out.print(s.charAt(mid));
			mid(s,start,mid-1);
			mid(s,mid+1,end);
			
		}
	}
}