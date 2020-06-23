//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/simran-and-stairs/
import java.util.*;
public class SimranAndStairs{
	static int ans;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ans=0;
		System.out.println(stairs(n));
	}
	//there is three stairs 1,2,3
	public static int stairs(int n){
		if (n==0 || n==1)
			return 1;
		else if (n==2)
			return 2;
		return stairs(n-1)+stairs(n-2)+stairs(n-3);
	}
}
