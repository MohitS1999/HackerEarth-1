import java.util.*;
public class OneStringNoTrouble{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//Convert string into char type array
		char c[]=s.toCharArray();
		int max=1;
		int cnt=1;
		for(int i=0;i<c.length-1;i++){
			if(c[i]!=c[i+1])
			{
				cnt++;
				if(max<cnt)
					max=cnt;
			}else{
				//if condition is false then cnt variable is initializes to zero
				cnt=1;
			}
		}
		System.out.println(max);
	}
}
