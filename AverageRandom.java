//5 - 7.2
//20 - 4.35
//50 - 3.86
//100 - 4.6

import java.util.Scanner;
public class AverageRandom {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		//User Prompt
		System.out.println("Enter interger: ");
		//Declares variables required for the while loop
		double numCounter = 0;
		int numInterger = input.nextInt();
		double numSum = 0;
		double sumAverage = 0;
		
	//Generates Random Numbers that are added together	
	while (numCounter <= numInterger) {
		
		double numRand = (int)(Math.random() * 10);
		
		numCounter = numCounter + 1;
		
		numSum = numSum + numRand;
			}
	
	input.close();
	
	sumAverage = numSum / numInterger;
	
	//Returns Average of Numbers
	System.out.println(sumAverage);
		
		}

}
