//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/hack-the-money/submissions/
import java.util.*;
public class HackTheMoney{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            float n=sc.nextFloat();
            if (n==1)
                System.out.println("Yes");
            else if (n<10)
                System.out.println("No");
            else{
                if (canHack(n)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
    static boolean canHack(float n){
        if ((n-((int)n)!=0) || (n<10 && n>1))
            return false;
        if (n==1)
            return true;
        if (canHack(n/10)||(canHack(n/20)))
            return true;
        else
            return false;
    }
}
