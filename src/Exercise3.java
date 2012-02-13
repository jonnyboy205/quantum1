import java.util.ArrayList;


public class Exercise3 {

	private int j;
	private int k;
	private int m;
	
	public Exercise3(int j, int k, int m){
		this.j = j;
		this.k = k;
		this.m = m;
	}
	
	public int calculateProb(){
		int ret = 0;
		
		//first make j into binary
		String leftSideString = Integer.toBinaryString(j);
		
		//create leftside of prob expression
		ArrayList<int[]> leftside = new ArrayList<int[]>(k);
		for (int i=0; i<k; i++){
			if (leftSideString.charAt(i)=='0'){
				int[] temp = {1, 0};
				leftside.set(i, temp);
			}
			else{ // leftSideString.charAt(0) == '1'
				int[] temp = {0, 1};
				leftside.set(i, temp);
			}
		}
		
		//create middle of prob expression
		ArrayList<Gate> middle = new ArrayList<Gate>(k);
		for (int x=0; x<k; x++){
			
		}

		
		return ret;
	}
	
}
