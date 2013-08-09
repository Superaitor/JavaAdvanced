package calculator;

public class Test {
	
	
	public static void main(String []args) {
		calculator calc = new calculator();
		int result = calc.calculate("2 + 4 * 47 - ( 69 - 89 ) - 78");
		System.out.println("Result: " + result );
	}

}
