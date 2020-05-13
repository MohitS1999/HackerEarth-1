import java.util.*;
public class BinaryAssociative{
	static int c0;
	static int c1;
	static int c2;
	static int c3;
	
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			 c0=sc.nextInt();
			 c1=sc.nextInt();
			 c2=sc.nextInt();
			 c3=sc.nextInt();
			 int flag=0;
			//Loop for table
			/*
			i j k
			0 0 0
			0 1 0
			0 1 1
			1 0 0
			1 0 1
			1 1 0
			1 1 1
			*/
			 for (int i=0;i<2;i++){
				 for(int j=0;j<2;j++){
					 for (int k=0;k<2;k++){
						 if (fun(fun(i,j),k)!=fun(i,fun(j,k)))
						{
							flag=1;
							System.out.println("No");
							break;
						}	
					 }
					 if (flag==1)
						 break;
				 }
				 if (flag==1)
					 break;
			 }
			 if (flag==0)
				 System.out.println("Yes");
			
		}
	}
	//Truth Table
	static int fun(int a,int b){
		if (a==0 && b==0)
			return c0;
		else if (a==0 && b==1)
			return c1;
		else if (a==1 && b==0)
			return c2;
		return c3;
	} 
}
