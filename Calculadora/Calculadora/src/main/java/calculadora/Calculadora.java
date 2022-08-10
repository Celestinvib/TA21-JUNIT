package calculadora;

public class Calculadora {
	
	/**Attributes*/
	private double num1;
	
	private double num2;
	
	private String op;
	
	private double r;

	/** Constructors */
	
	public void Calculadora() {		
	}
	
	/**Getters & Setters */
	
	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}

	
	/**
	 * Add
	 * 
	 * @param a
	 * @param b
	 * @return result of a + b
	 */
	public static double add(double a, double b) {
		return a + b;
	}

	/**
	 * Substract
	 * 
	 * @param a
	 * @param b
	 * @return result of a - b
	 */
	public double susbtract(double a, double b) {
		return  a - b;
	}

	/**
	 * Multiply
	 * 
	 * @param a
	 * @param b
	 * @return result of a * b
	 */
	public double multiply(double a, double b) {
		return a * b;
	}

	/**
	 * Split
	 * 
	 * @param a
	 * @param b
	 * @return r
	 */
	public double split(double a, double b) {
		return a / b;
	}
	
	
	/**
	* Square Root
	* 
	* @param a
	* @return result of √a
	*/
	public double squareRoot(double a) {
	    return Math.sqrt(a);
	}	
	
	
	/**
	* Raised
	* 
	* @param a
	* @return result of a * a
	*/
	public double raisedTo(double a) {
	    return a * a;
	}

	/**
	* 1 Split a
	* 
	* @param a
	* @return result of 1/a
	*/
	public double oneSplitNum(double a) {
	    return split(1,a);
	}
	
	/**
	* Change the sign of the num
	* 
	* @param a
	* @return num with the state changed
	*/
	public double changeSign(double a) {
		if (a > 0) {
			return -a;
		}else {
			return -a * -1;
		}
	}
	
	/**
	* Converts the num to decimal
	* 
	* return the num with a doc at the end
	*/
	public double addDecimal(double num) {
		String numWDecimal = String.valueOf(num);
		numWDecimal += ".";
		return Double.parseDouble(numWDecimal);	
	}
	
	//CHANGE THIS TWO METHODS  (DELETE)
	
//	/**
//	* Delete the last value of the num
//	* 
//	*/
//	public double deleteLast() {
//		
//	}
//	
//	/**
//	* Add a value to the num in the last position
//	* 
//	*/
//	public double addLast() {
//		
//	}
//	
	/**
	* Clear all the fields of the calc
	* 
	* return 0 the new value of num
	*/
	public double clearCurrentNum() {
		return 0;	
	}
	
	/**
	* Clear all the fields of the calc
	* 
	* @param a
	* @return result of 1/a
	*/
	public void clear() {
		num1 = 0;
		num2 = 0;
		op = "";	
	}
}
