//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/approximate/killjee-and-easy-problem/
//Dfs
import java.util.*;
public class Killjee{
	static int n;
	static int m;
	static int ar[][];
	static int visited[];
	static List<Integer> l=new ArrayList<>();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		visited=new int[n+1];
		Arrays.fill(visited,0);
		ar=new int[n+1][n+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				ar[i][j]=0;
			}
		}
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			ar[a][b]=1;
		}
		dfs(1);
		System.out.println(l.size());
		for (int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
	}
	static void dfs(int u){
		
		if (visited[u]==0){
			l.add(u);
			visited[u]=1;
			for (int v=1;v<=n;v++){
				if (ar[u][v]==1 && visited[v]==0){
					dfs(v);
				}
			}
		}
		
	}
}
