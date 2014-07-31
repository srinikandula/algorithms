package srini.algorithms;

public class WeightedQuickUnion{
	private int array[];
	private int sz[];
	public WeightedQuickUnion(int n){
		array = new int[n];
		sz= new int[n];
		for(int i=0;i<n;i++){
			array[i] = i;
		}
	}
	public void union(int x, int y) {
		int p =array[x];
		int q = array[y];
		if(p == q)
			return;
		if(sz[p] <  sz[q]){
			array[p] = q;
			sz[q] += sz[p];
		}else{
			array[q] = p;
			sz[p] += sz[q];
		}
	}
	private int root(int p){
		while(p != array[p])
			p = array[p];
		return p;
	}
	public boolean connected(int p,int q){
		return root(p) == root(q);
	}
	public void print(){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		WeightedQuickUnion find = new WeightedQuickUnion(10);
		find.union(3,2);
		System.out.print("(3,2)   ");
		find.print();
		find.union(5,0);
		System.out.print("(5,0)   ");
		find.print();
		find.union(3,7);
		System.out.print("(3,7)   ");
		find.print();
		find.union(0,9);
		System.out.print("(0,9)   ");
		find.print();
		find.union(9,1);
		System.out.print("(9,1)   ");
		find.print();
		find.union(5,6);		
		System.out.print("(5,6)   ");
		find.print();
		find.union(7,6);		
		System.out.print("(7,6)   ");
		find.print();
		find.union(9,4);		
		System.out.print("(9,4)   ");
		find.print();
			}
}
