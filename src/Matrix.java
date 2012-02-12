
public class Matrix {

	private int numRows; 
	private int numColumns;
	
	public Matrix(int numRows, int numColumns){
		this.numRows = numRows;
		this.numColumns = numColumns;
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

}
