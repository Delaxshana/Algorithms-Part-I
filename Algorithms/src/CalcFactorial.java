import java.util.*;

public class CalcFactorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		int num;
		System.out.println("Enter the number to find factorial :");
		num=sc.nextInt();
		double fact= findFact(num);
		System.out.println("The factorial of number " + num + " is " + fact);
	}
	
	public static double findFact(int num) {
		if(num>= 1)
			return num * findFact(num-1);
		else 
			return 1;
		
	}

}
