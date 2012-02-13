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
	
	public double calculateProb(){
		double ret = 1;
		
		ArrayList<int[]> leftSide = doLeft();
		ArrayList<Gate> middle = doMiddle();
//		ArrayList<int[]> rightSide = doRight();
		String rightSideString = Integer.toBinaryString(m);
		rightSideString = fixLengthOfBinary(rightSideString);
		
		ArrayList<Complex[]> middleRight = new ArrayList<Complex[]>();
		for (int i=0; i<k; i++){
			Complex[] element = (middle.get(i)).ket(rightSideString.charAt(i));
			middleRight.add(element);
		}
		
		for (int y=0; y<k; y++){
			ret = ret * Gate.dotProd(leftSide.get(y), middleRight.get(y));
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
		for (int x=1; x<=k; x++){
			middle.add(new Gate(x));
		}
		
		return middle;
	}

	private ArrayList<int[]> doLeft() {
		//first make j into binary
		String leftSideString = Integer.toBinaryString(j);
		leftSideString = fixLengthOfBinary(leftSideString);
		
		//create leftside of prob expression
		ArrayList<int[]> leftside = new ArrayList<int[]>(k);
		for (int i=0; i<k; i++){
			if (leftSideString.charAt(i)=='0'){
				int[] temp = {1, 0};
				leftside.add(temp);
			}
			else{ // leftSideString.charAt(0) == '1'
				int[] temp = {0, 1};
				leftside.add(temp);
			}
		}
		
		return leftside;
	}
	
	private String fixLengthOfBinary(String binaryStr){
		String ret = "";
		
		if (binaryStr.length()!=k){
			//binaryStr.length should be < k if reaches here.
			int diff = k-binaryStr.length();
			for (int i=0; i<diff; i++){
				ret=ret.concat("0");
			}
			ret = ret.concat(binaryStr);
		}
		else{
			ret = binaryStr;
		}
		
		return ret;
	}
	
}
