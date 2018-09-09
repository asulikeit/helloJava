import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mst1 {
	public static void main(String[] args) {
		GraphMst1 graph = new GraphMst1(5);
		graph.insert(1, 2, 1);
		graph.insert(1, 3, 3);
		graph.insert(1, 4, 2);
		graph.insert(2, 3, 5);
		graph.insert(2, 4, 3);
		graph.insert(3, 4, 4);
		graph.insert(5, 2, 3);
		graph.insert(5, 4, 2);
		graph.mst();
	}
}

class GraphMst1 {
	private List<ClsMst1> listCls;
	private int[] parent;
	private int m = -1;
	public GraphMst1(int N) {
		listCls = new ArrayList<>(N+1);
		insert(0, 0, 0);
		parent = new int[N+1];
		// make a set
		for (int i=1; i<=N; i++) {
			parent[i] = i;
		}
	}
	public void insert(int x, int y, int cost) {
		listCls.add(new ClsMst1(x, y, cost));
		m += 1;
	}
	public void mst() {
		Collections.sort(listCls);
		
		int L, R;
		int answer = 0;
		for(int i=1; i<=m; i++) {
			L = get(listCls.get(i).start);
			R = get(listCls.get(i).end);
			if (L != R) {
				answer += listCls.get(i).cost;
				parent[L] = R;
			}
		}
		
		System.out.println(answer);
	}
	private int get(int a) {
		if (a == parent[a]) {
			return a;
		}
		return parent[a] = get(parent[a]);
	}
}

class ClsMst1 implements Comparable<ClsMst1> {
	public int start;
	public int end;
	public int cost;
	public ClsMst1(int s, int e, int c) {
		start = s;
		end = e;
		cost = c;
	}
	public int compareTo(ClsMst1 cls) {
		if (cls.start > start) return -1;
		if (cls.start < start) return 1;
		return 0;
	}
}