
public class Exercise3Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int j = -Integer.MIN_VALUE;
		if (args[0] != null)
			j = Integer.parseInt(args[0]);
		
		int k = -Integer.MIN_VALUE;
		if (args[1] != null)
			k = Integer.parseInt(args[1]);
		
		int m = -Integer.MIN_VALUE;
		if (args[2] != null)
			k = Integer.parseInt(args[2]);
		
		Exercise3 e = new Exercise3(j,k,m);
		System.out.println("The probability to measure j=2 in a k=2 qubit system " +
				"on input m=" + m + "is: " + e.calculateProb());
	}

}
