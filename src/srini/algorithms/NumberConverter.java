package srini.algorithms;

public class NumberConverter{
	
	
	public int sriniDecimalToBinary(int n){
		int result = 0;
		while(n >0){
			int binary = n%2;
			result = result*10+binary;
			n = n/2;
		}
		return result;
	}

	public int sriniBinaryToDecimal(int n){
		int result = 0;
		int base = 0;
		while(n>0){
			int reminder = n%10;
			result += (Math.pow(2, base++)*reminder);
			n = n/10;
		}		
		return result;
	}

}
