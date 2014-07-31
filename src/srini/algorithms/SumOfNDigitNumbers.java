package srini.algorithms;

public class SumOfNDigitNumbers {
	public static void main(String[] args) {
		
	}
	public int calculateSum(int digits){
		 int a,b,sum = 0;
		   for (a = digits; a > 0; a--) {
		        for (b = digits-1; b >= 0; b--)
		            sum += (a*Math.pow(10, b));		        
		    }
		    for (b = digits-1; b > 0; b--)
		        sum *= b;
		    return sum;
	}
}
