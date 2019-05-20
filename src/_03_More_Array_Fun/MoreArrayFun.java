package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	int ran = 0;
	Random ron = new Random();
	public static void main(String[] args) {
		//testArray values
		String[] testArray = new String[10];
		testArray[0] = "1";
		testArray[1] = "2";
		testArray[2] = "3";
		testArray[3] = "4";
		testArray[4] = "5";
		testArray[5] = "6";
		testArray[6] = "7";
		testArray[7] = "8";
		testArray[8] = "9";
		testArray[9] = "10";
		//random
		
		
		
		//object of class
		MoreArrayFun fun = new MoreArrayFun();
		//test1
		fun.StringPrint(testArray);
		//test2
		fun.StringPrintReverse(testArray);
		//test3
		fun.StringPrintEveryOther(testArray);
		//test4
		fun.StringPrintRandom(testArray);
		//
		//randomAganin
		
	}
	
	
	//2. Write a method that  takes an array of Strings and prints all the Strings in the array.
 void StringPrint(String testArray[]) {
		for(int e = 0; e < testArray.length; e++) {
			System.out.println(testArray[e]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
 void StringPrintReverse(String testArray[]) {
		for(int f = testArray.length - 1; f > -1; f--) {
			System.out.println(testArray[f]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
 void StringPrintEveryOther(String testArray[]) {
		for(int j = 0; j < testArray.length; j++) {
			if((j % 2) == 0) {
				System.out.println(testArray[j]);
			}
			
		}
	}
	//POSSIBLY CHANGE THIS
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
 void StringPrintRandom(String testArray[]) {
		for(int o = 0; o < testArray.length; o++) {
			//random number
			ran = ron.nextInt(testArray.length);
			//number repeat check
			//POSSIBLY DO IF I FEEL LIKE IT OTHERWISE MOVE ON
			System.out.println(testArray[ran]);
				
			
			
		}
	}
	
}
