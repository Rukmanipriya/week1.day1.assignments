package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an Input and assign a value 13
		int input = 13;
		// Declare a boolean variable flag as false
		boolean flag = false;

		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; i++) {
			// Divide the input with each for loop variable and check the remainder
			if (input % i == 0) {
				// Set the flag as true when there is no remainder

				// break the iterator
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Number is not a prime number");
		} else {
			System.out.println("Number is a prime number");
		}

	}

}
