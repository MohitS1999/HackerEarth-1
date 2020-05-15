import java.util.*;
public class Dice{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		int cnt=0;
		int i=0;
		int flag=0;
		for(char c:s.toCharArray()){
			i++;
			if (c!='6')
				cnt++;
			if (i==len){
				if (c=='6')
					flag=1;
			}
		}
		if (flag==0)
			System.out.println(cnt);
		else 
			System.out.println("-1");
	}
}
