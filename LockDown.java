import java.util.*;
public class LockDown{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        String s=sc.next();
        for(int i=0;i<n;i++)
            list.add(i);
        lockDown(list,0,0,s);
    }
    static void lockDown(ArrayList<Integer> list,int start,int ptr,String str){
        if (list.size()==1){
            System.out.println(list.get(0)+1);
            return;
        }
        ptr=ptr%list.size();
        int i=start%str.length();
        if (str.charAt(i)=='x')
            lockDown(list,start+1,ptr+1,str);
        else{
            list.remove(ptr);
            lockDown(list,start+1,ptr,str);
        }
    }
}