import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {
	
	public static void main(String[] args) {
		GraphBfs1 graph = new GraphBfs1(6);
		graph.insert(1, 2);
		graph.insert(3, 1);
		graph.insert(2, 3);
		graph.insert(4, 2);
		graph.insert(3, 6);
		graph.insert(5, 4);
		graph.bfs(); // 1, 2, 3, 6, 4, 5, 3(x)
	}
}

class GraphBfs1 {
	private ArrayList<ArrayList<Integer>> v;
	private boolean[] visited;
	private Queue<Integer> queue = new LinkedList<Integer>();
	public GraphBfs1(int n) {
		v = new ArrayList<ArrayList<Integer>>(n+1);
		for (int i=0; i<=n; i++) {
			v.add(new ArrayList<Integer>());
		}
		visited = new boolean[n+1];
		queue.add(1);
		System.out.print(1 + " ");
	}
	
	public void insert(int x, int y) {
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		v.get(x).add(y);
	}

	public void bfs() {
		int node = queue.poll();
		for (int now : v.get(node)) {
			if (!visited[now]) {
				System.out.print(now + " ");
				queue.add(now);
				visited[now] = true;
				bfs();
			}
		}
	}
}
