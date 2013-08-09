package calculator;


import java.util.*;


public class calculator {
	
	ArrayList <String> operators; 
	ArrayList <Integer> numbers; 
	
	public calculator() {
		operators = new ArrayList <String> ();
		numbers = new ArrayList <Integer> ();
		
		
	}


public int calculate(String expr) {
	numbers.clear();
	operators.clear();
	
	String[] parts = expr.split(" ");
	
	for (String p : parts ) {
		if(p.equals("(")){
			operators.add(p);
		}
		
		else if (p.equals("")){
			while(shouldReduce(p)){
				reduce();
				
			}
			operators.remove( operators.size()-1);
			
		}
		else if(isOperator(p)){
			while (shouldReduce(p)){
				reduce();
		
	}
			
			addOperator(p);
		}
	
		else
		{
			AddNumber(p);
		}
	}
	while(operators.size()>0){
		reduce();
	
}
	return numbers.get(0);}

	private boolean isOperator(String op){
		return op.equals("*")||op.equals("/")||op.equals("+")||op.equals("-");
		
	}
 


private void reduce(){
	if(numbers.size()>1){
	int num1 = numbers.remove(numbers.size() - 1);
	int num2 = numbers.remove(numbers.size() - 1);
	String op = operators.remove(operators.size() - 1);
	if(op.equals("+")){
		numbers.add(num1 + num2);
	}
	if (op.equals("-")){
		numbers.add(num2 - num1);
		
	}
	if (op.equals("*")){
		numbers.add(num1 * num2);
		
	}
	if (op.equals("/")){
		numbers.add(num1 / num2); 
	}
	}
}


private void AddNumber(String number){
	int value = Integer.parseInt(number);
	numbers.add(value);
	
	
}


private void addOperator(String operator) {
	operators.add(operator);
}

private boolean shouldReduce(String op) {
	if (precedence(lastOperator()) >= precedence(op)) {
		return true;
	}
	return false;
}

private int precedence(String operator) {
	if (operator.equals("+") || operator.equals("-")) {
		return 1;
	}
	if (operator.equals("*") || operator.equals("/")) {
		return 2;
	}
	return 0;
}

private String lastOperator() {
	if(operators.size() > 0) {
		return operators.get(operators.size()-1);
	}
	return"";
	
			
}
}