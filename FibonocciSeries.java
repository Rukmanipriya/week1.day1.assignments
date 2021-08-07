package week1.day1.assignments;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables 
		//(Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
int range=8, firstNum=0, secNum=1, sum=0;
				// Print first number
System.out.print(firstNum+","+ secNum);
			
				// Iterate from 1 to the range
for(int i=1; i<range;i++) {
	sum = firstNum+secNum;

	// Assign second number to the first number
	
	firstNum=secNum;

	// Assign sum to the second number
	secNum=sum;
	
	// print sum
	System.out.print(","+sum);
}	
		

	}

}
