package srini.algorithms;

public class QuickFind {
	private int array[];
	public QuickFind(int n){
		array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = i;
		}
	}
	public void union(int x, int y) {
		int p =array[x];
		int q = array[y];
		for(int i =0 ;i<array.length;i++){
			if(array[i] == p)
				array[i] = q;
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
			System.out.print(array[i]+"  ");
	}
	
	public static void main(String[] args) {
		QuickFind find = new QuickFind(10);
		find.union(9,1);
		find.union(7,0);
		find.union(6,0);
		find.union(3,9);
		find.union(4,0);
		find.union(9,0);		
		find.print();
	}
}
