//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/hihi-and-crazy-bits/description/
import java.util.*;
public class HihiAndCrazyBit{
    public static void main(String[] arrhs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            //if we want to change the current 'n' to the next greater 'n' and differ by only 1 bit
            System.out.println(n|n+1);
        }

    }
}
