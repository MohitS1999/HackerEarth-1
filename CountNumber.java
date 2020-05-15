import java.util.Scanner;
class CountNumber{
	public static void main(String args[] ) throws Exception {
	Scanner s = new Scanner(System.in);
	int T = s.nextInt();
		for(int i=0;i<T;i++)
		{
			int N=s.nextInt();
			String string=s.next();

			if (N==string.length())
			{ 
				int count=0;
				boolean a=false;
				for(int j=0;j<N;j++){
					char ch=string.charAt(j);
					if (((ch=='0')||(ch=='1')||(ch=='2')||(ch=='3')||(ch=='4')||(ch=='5')||(ch=='6')||(ch=='7')||(ch=='8')||(ch=='9'))&&(a==false)){
						count++;
						a=true;
					}
					else if (((ch=='0')||(ch=='1')||(ch=='2')||(ch=='3')||(ch=='4')||(ch=='5')||(ch=='6')||(ch=='7')||(ch=='8')||(ch=='9'))&&(a==true))
					{
						a=true;
					}
					else 
					{
						a=false;
					}
				}
				System.out.println(count);
			}
		}
	}
}
