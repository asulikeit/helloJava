import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mst2 {
	public static void main(String[] args) {
		int N = 5;
		List<ClsMst2> listCls = new ArrayList<>(N);
		listCls.add(new ClsMst2(1, 2, 1));
		listCls.add(new ClsMst2(1, 3, 3));
		listCls.add(new ClsMst2(1, 4, 2));
		listCls.add(new ClsMst2(2, 3, 5));
		listCls.add(new ClsMst2(2, 4, 3));
		listCls.add(new ClsMst2(3, 4, 4));
		listCls.add(new ClsMst2(5, 2, 3));
		listCls.add(new ClsMst2(5, 4, 2));

		Collections.sort(listCls);
		
		
	}
}

class ClsMst2 implements Comparable<ClsMst2> {
	private int start;
	private int end;
	private int cost;

	public ClsMst2(int s, int e, int c) {
		start = s;
		end = e;
		cost = c;
	}

	public int compareTo(ClsMst2 cls) {
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