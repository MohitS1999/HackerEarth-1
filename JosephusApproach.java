/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class JosephusApproach{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    System.out.println(fun(n,k));
		}
	}
	static int fun(int n,int k){
		int ans=0;
	    if (n==1)
	        return 1;
		//Josephus Formula
	    return (fun(n-1,k)+k-1)%n+1;
	}
}