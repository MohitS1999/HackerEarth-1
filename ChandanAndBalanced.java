import java.util.*;
public class ChandanAndBalanced{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int cnt=0;
			for(int i=0;i<s.length()-1;i++){
				for(int j=i+1;j<s.length();j+=2)
				{
					String s1=s.substring(i,j+1);
					//if substring is palidrome then increse the count
					if (str(s1)){
						cnt++;
						System.out.println(s1);
					}
				}
			}
			System.out.println(cnt);
		}
	}
	//check string is palidrome or not
	static boolean str(String s){
		int j=s.length()-1;
		int i=0;
		char c[]=s.toCharArray();
		while (i<j){
			if (c[i]!=c[j]){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
