
public class Gate {
	
	Complex[] column0;
	Complex[] column1;
	
	public Gate(int l){
		
		column0 = new Complex[2];
		column1 = new Complex[2];
		
		switch(l%6){
			case 0: setEntriesAsT();
					break;
			case 1: setEntriesAsX();
					break;
			case 2: setEntriesAsY();
					break;
			case 3: setEntriesAsZ();
					break;
			case 4: setEntriesAsH();
					break;
			case 5: setEntriesAsS();
					break;
		}
	}

	private void setEntriesAsX() {
		column0[0] = new Complex(0, 0);
		column0[1] = new Complex(1, 0);
		
		column1[0] = new Complex(1, 0);
		column1[1] = new Complex(0, 0);
		
	}

	private void setEntriesAsY() {
		column0[0] = new Complex(0, 0);
		column0[1] = new Complex(0, 1);
		
		column1[0] = new Complex(0, -1);
		column1[1] = new Complex(0, 0);
	}

	private void setEntriesAsZ() {
		column0[0] = new Complex(1, 0);
		column0[1] = new Complex(0, 0);
		
		column1[0] = new Complex(0, 0);
		column1[1] = new Complex(-1, 0);
	}

	private void setEntriesAsH() {
		column0[0] = new Complex(Math.sqrt(1/2), 0);
		column0[1] = new Complex(Math.sqrt(1/2), 0);
		
		column1[0] = new Complex(Math.sqrt(1/2), 0);
		column1[1] = new Complex(-Math.sqrt(1/2), 0);
	}

	private void setEntriesAsS() {
		column0[0] = new Complex(1, 0);
		column0[1] = new Complex(0, 0);
		
		column1[0] = new Complex(0, 0);
		column1[1] = new Complex(0, 1);
	}

	private void setEntriesAsT() {
		column0[0] = new Complex(1, 0);
		column0[1] = new Complex(0, 0);
		
		column1[0] = new Complex(Math.cos(Math.PI/2), Math.sin(Math.PI/2));
		column1[1] = new Complex(Math.cos(Math.PI/4), Math.sin(Math.PI/4));
	}
	
	public Complex[] ket(int a){
		if (a==0){
			return column0;
		}
		if (a==1){
			return column1;
		}
		return null;
	}
	
	public static Complex dotProd(int[] vector, Complex[] rightSide){
		return new Complex(vector[0]*rightSide[0].getRe() + vector[1]*rightSide[1].getRe(), 
				vector[0]*rightSide[0].getIm() + vector[1]*rightSide[1].getIm());
	}
	
}