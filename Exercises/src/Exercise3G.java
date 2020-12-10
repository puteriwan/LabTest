public class Exercise3G {

	public static void main(String[] args) {
		
		// for loop
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for(int number = lowerbound; number <= upperbound; number++) {
			sum = sum + number;
		}
		
		average = sum/100.00;
		System.out.println("The sum of 1 to 100 is " +sum);
		System.out.println("The average: " +average);
		System.out.println();
		
		
		// while loop
		int sum1 = 0;
		double average1;
		int lowerbound1 = 1;
		int upperbound1 = 100;
		int num1 = lowerbound1;
		
		while(num1 <= upperbound1) {
			sum1 = sum1 + num1;
			num1++;
		}
		
		average1 = sum1/100.00;
		System.out.println("The sum of 1 to 100 is " +sum1);
		System.out.println("The average: " +average1);
		System.out.println();
		
		
		// do while loop
		int sum2 = 0;
		double average2;
		int lowerbound2 = 1;
		int upperbound2 = 100;
		int num2 = lowerbound2;
		
		do {
			sum2 = sum2 + num2;
			num2++;
		}while(num2 <= upperbound2);
		
		average2 = sum2/100.00;
		System.out.println("The sum of 1 to 100 is " +sum2);
		System.out.println("The average: " +average2);
		System.out.println();

	}

}