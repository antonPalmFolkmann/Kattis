package ADS;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DisjointSets {
	// Based on the class WeightedQuickUnionUF from page 228 in SW.
	// Implemented own main-method and move-method, modified find-method for path compression from SW website.
	// Anton Folkmann (anpf), tips from Frederik Rothe (frot), February 2021.
	private int[] id;
	private int[] sz;
	private int count;
	
	public static void main(String[] args){
		int n = StdIn.readInt();
		int m = StdIn.readInt();
		
		DisjointSets ds = new DisjointSets(n);
		
		for (int i = 0; i < m; i++){
			int action = StdIn.readInt();
			int s = StdIn.readInt();
			int t = StdIn.readInt();

			if (action == 0) {
				if (ds.connected(s,t)) {
					StdOut.println(1);
				} else { 
					StdOut.println(0);
				}
			} else if (action == 1) {
				ds.union(s,t);
			} else if (action == 2) {
				ds.move(s,t);
			}
		}	
	}

	public DisjointSets(int n) {
		count = n;
		id = new int[n];
		sz = new int[n];
		for (int i = 0; i < n; i++){
			id[i] = i;
			sz[i] = 1;
		}
	}

	public int count(){ return count;}

	public boolean connected(int p, int q) {return find(p) == find(q);}

	public int find(int p) {
		int root = p;
		while (root != id[root]) {root = id[root];}
		while (p != root) {
			int newp = id[p];
			id[p] = root;
			p = newp;
		}
		return p;
	}

	public void union(int p, int q){
		int i = find(p);
		int j = find(q);
		if (i == j) return;

		// Make smaller root point to larger one
		if (sz[i] < sz[j]){ id[i] = j; sz[j] += sz[i]; }
		else 		  { id[j] = i; sz[i] += sz[j]; }
		count--;
	}

	public void move(int p, int q){
		int i = find(p);
		int j = find(q);
		if (i == j) return;

		for (int k = 0; k < id.length; k++){
			if (connected(k,p)){
				id[k] = id[p];
			}
		}

		id[i] = j;
		sz[j] += sz[i];
	}
}


