import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mst {
	public static void main(String[] args) {
		int N = 5;
		int M = 8;
		List<Cls> listCls = new ArrayList<>();
		listCls.add(new Cls(1, 2, 1));
		listCls.add(new Cls(1, 3, 3));
		listCls.add(new Cls(1, 4, 2));
		listCls.add(new Cls(2, 3, 5));
		listCls.add(new Cls(2, 4, 3));
		listCls.add(new Cls(3, 4, 4));
		listCls.add(new Cls(5, 2, 3));
		listCls.add(new Cls(5, 4, 2));

		Collections.sort(listCls);
		
		
	}
}

class Cls implements Comparable<Cls> {
	private int start;
	private int end;
	private int cost;

	public Cls(int s, int e, int c) {
		start = s;
		end = e;
		cost = c;
	}

	public int compareTo(Cls cls) {
		if (cls.getS() > start) return -1;
		if (cls.getS() < start) return 1;
		return 0;
	}

	public int getS() {
		return start;
	}

	public int getE() {
		return end;
	}

	public int getC() {
		return cost;
	}
}