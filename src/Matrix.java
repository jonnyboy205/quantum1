public class Matrix {

	private int numRows; 
	private int numColumns;
	private int[][] entries;
	
	public Matrix(int numRows, int numColumns){
		this.numRows = numRows;
		this.numColumns = numColumns;
		entries = new int[2][2];
	}
	
	public Matrix(int numRows, int numColumns, int l){
		this.numRows = numRows;
		this.numColumns = numColumns;
		entries = new int[2][2];
		
		switch(l%6){
			case 1: setEntriesAsX();
			case 2: setEntriesAsY();
			case 3: setEntriesAsZ();
			case 4: setEntriesAsH();
			case 5: setEntriesAsS();
			case 6: setEntriesAsT();
		}
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}
	
	public static Matrix tensorProduct(Matrix a, Matrix b){
		Matrix ret = null;
		if (a.getNumColumns() == b.getNumRows())
			ret = new Matrix(a.getNumRows(), b.getNumColumns());
		
		//TODO calculate tensor product
		
		return ret;
	}
	
	private void setEntriesAsX(){
		entries[0][0] = 0;
		entries[1][0] = 1;
		entries[0][1] = 1;
		entries[1][1] = 1;
	}
	
	private void setEntriesAsY() {
		entries[0][0] = 0;
		entries[1][0] = 
	}

}
