// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class LoveTriangle{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        //loop execute untill user enter input
        while(s.hasNext()) {
            long num = s.nextLong();
            StringBuilder res = new StringBuilder();
            if (num==0) res.append(0);
            while(num>0)
            {
                res.append(num%9);
                num = num/9;
            }
            //reverse the res
            res.reverse();
            System.out.println(res);
        }
    }
}
