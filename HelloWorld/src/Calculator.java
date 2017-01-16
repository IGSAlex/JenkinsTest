
public class Calculator {

	private double number1;
	private double number2;
	
	public Calculator(double number1, double number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public double add(){
		return number1 + number2;
	}
	
	public double sub(){
		return number1 - number2;
	}
	
	public double times(){
		return number1 * number2;
	}
	
	public double over(){
		return number1/number2;
	}
}
