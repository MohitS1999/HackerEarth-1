import java.util.*;
public class KilljeeSuperDromes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        int a[]=new int[t];
        for (int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
		for(int i=0;i<t;i++){
			int n=a[i];
            if (n>=585585)
                System.out.println("19");
			else if (n<585585 && n>=73737)
				System.out.println("18");
			else if (n<73737 && n>=53835)
				System.out.println("17");
			else if (n<53835 && n>=53235)
				System.out.println("16");
			else if (n<53235 && n>=39993)
				System.out.println("15");
			else if (n<39993 && n>=32223)
				System.out.println("14");
			else if (n<32223 && n>=15351)
				System.out.println("13");
			else if (n<15351 && n>=9009)
				System.out.println("12");
			else if (n<9009 && n>=7447)
				System.out.println("11");
			else if (n<7447 && n>=717)
				System.out.println("10");
			else if (n<717 && n>=585)
				System.out.println("9");
			else if (n<585 && n>=313)
				System.out.println("8");
			else if (n<313 && n>=99)
				System.out.println("7");
			else if (n<99 && n>=33)
				System.out.println("6");
			else if (n<33 && n>=9)
				System.out.println("5");
			else if (n<9 && n>=7)
				System.out.println("4");
			else if (n<7 && n>=5)
				System.out.println("3");
			else if (n<5 && n>=3)
				System.out.println("2");
			else if (n<3 && n>=1)
				System.out.println("1");
		}
	}
}