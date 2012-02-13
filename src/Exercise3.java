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
		
		ArrayList<int[]> leftSide = doLeft();
		ArrayList<Gate> middle = doMiddle();
//		ArrayList<int[]> rightSide = doRight();
		String rightSideString = Integer.toBinaryString(m);
		
		ArrayList<Complex[]> middleRight = new ArrayList<Complex[]>();
		for (int i=0; i<k; i++){
			Complex[] element = (middle.get(i)).ket(rightSideString.charAt(i));
			middleRight.set(i, element);
		}
		
		return ret;
	}

//	private ArrayList<int[]> doRight() {
//		//make m into binary
//		String rightSideString = Integer.toBinaryString(m);
//		
//		//create right side of prob expression
//		ArrayList<int[]> rightSide = new ArrayList<int[]>(k);
//		for (int i=0; i<k; i++){
//			if (rightSideString.charAt(i)=='0'){
//				int[] temp = {1, 0};
//				rightSide.set(i, temp);
//			}
//			else{ // leftSideString.charAt(0) == '1'
//				int[] temp = {0, 1};
//				rightSide.set(i, temp);
//			}
//		}
//		return rightSide;
//	}

	private ArrayList<Gate> doMiddle() {
		//create middle of prob expression
		ArrayList<Gate> middle = new ArrayList<Gate>(k);
		for (int x=0; x<k; x++){
			middle.set(x, new Gate(x));
		}
		
		return middle;
	}

	private ArrayList<int[]> doLeft() {
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
		
		return leftside;
	}
	
}
