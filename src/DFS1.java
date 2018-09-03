import java.util.ArrayList;

public class DFS1 {
	
	public static void main(String[] args) {
		Graph graph = new Graph(6);
		graph.insert(1, 2);
		graph.insert(3, 1);
		graph.insert(2, 3);
		graph.insert(4, 2);
		graph.insert(3, 6);
		graph.insert(5, 4);
		graph.dfs(1); // 1, 2, 3, 6, 4, 5, 3(x)
	}
}

class Graph {
	private ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>>();
	private boolean[] visited;
//	private List<Integer> ;
	public Graph(int n) {
		for (int i=0; i<=n; i++) {
			v.add(new ArrayList<Integer>());
		}
		visited = new boolean[n+1];
	}
	
	public void insert(int x, int y) {
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		v.get(x).add(y);
	}

	public void dfs(int start) {
		int now = start;
		if (!visited[now]) {
			System.out.print(now + " ");
			visited[now] = true;
			for(int i : v.get(now)) {
				dfs(i);
			}
		}
	}
}
