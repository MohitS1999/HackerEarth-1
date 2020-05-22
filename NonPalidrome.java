import java.util.*;
public class NonPalidrome{
	public static void main(String[] ahr){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		if (checkPalidrome(s,l)){
			if (l%2==0)
				System.out.println(l/2);
			else 
				System.out.println((l/2)+1);
		}else{
			System.out.println(l);
		}
	}
	//check String is palidrome or not
	static boolean checkPalidrome(String s,int len){
		char ch[]=s.toCharArray();
		int i=0;
		int j=len-1;
		int flag =1;
		while (i<j){
			if (ch[i]!=ch[j]){
				flag=0;
				break;
			}
			i++;
			j--;
		}
		if (flag==0)
			return false;
		return true;
	}
}
