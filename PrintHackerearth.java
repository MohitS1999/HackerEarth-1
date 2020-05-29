import java.util.*;
public class PrintHackerearth{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0;
		//count the frequency of every Character
		for(char c:s.toCharArray()){
			if (c=='a')
				p1++;
			else if(c=='c')
				p2++;
			else if(c=='e')
				p3++;
			else if(c=='h')
				p4++;
			else if(c=='k')
				p5++;
			else if(c=='r')
				p6++;
			else if(c=='t')
				p7++;
		}
			p1=(int)p1/2;
			p3=(int)p3/2;
			p4=(int)p4/2;
			p6=(int)p6/2;
			int a[]={p1,p2,p3,p4,p5,p6,p7};
			Arrays.sort(a);
			System.out.println(a[0]);
		
	}
}
