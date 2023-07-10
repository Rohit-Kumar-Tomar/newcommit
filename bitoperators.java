package codewithharry;

public class bitoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 7;
		byte z = 2;
		//bitwise and
		System.out.println("x and y = " + (x&y));
		//bitwise or
		System.out.println("x and y = " + (x|y));
		//bitwise xor
		System.out.println("x and y = " + (x^y));
		//bitwise compliment
		System.out.println("x compliment = " + (~x));
		
		//
		String num1 = "1010";
		String num2 = "0111";
			
			int number1 = Integer.parseInt(num1, 2);
		int number2 = Integer.parseInt(num2, 2);
			int sum = number1 + number2;
		
		System.out.println(sum);
		
		   
				
				
				
				

	}

}
