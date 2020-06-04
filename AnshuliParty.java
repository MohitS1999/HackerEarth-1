//https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/sheero-and-the-party/
import java.util.Scanner;
public class AnshuliParty {
    static   int mod=(int)Math.pow(10,9)+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String x=sc.next();
            String y=sc.next();
            System.out.println(powerStrings(x,y));
        }
    }
    //if the length of string is greater then 18
    static long powerStrings(String sa, String sb)
    {
        long a = 0, b = 0;
        for (int i = 0; i < sa.length(); i++)
        {
            a = (a * 10 + (sa.charAt(i) - '0')) %
                    mod;
        }
        for (int i = 0; i < sb.length(); i++)
        {
            b = (b * 10 + (sb.charAt(i) - '0')) %
                    (mod- 1);
        }
        return powerLL(a, b);
    }
    static long powerLL(long x, long n)
    {
        long result = 1;
        while (n > 0)
        {
            if (n % 2 == 1)
            {
                result = result * x % mod;
            }
            n = n / 2;
            x = x * x % mod;
        }
        return result;
    }
 
}
