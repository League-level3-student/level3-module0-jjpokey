package _03_More_Array_Fun;

import java.awt.Robot;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	int ran = 0;
	Random ron = new Random();
	//test/storage variables
	boolean test1 = false;
	boolean test2 = false;
	boolean test3 = false;
	boolean test4 = false;
	boolean test5 = false;
	boolean test6 = false;
	boolean test7 = false;
	boolean test8 = false;
	boolean test9 = false;
	boolean test10 = false;
	boolean loop = true;
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
			//System.out.println(testArray[e]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
 void StringPrintReverse(String testArray[]) {
		for(int f = testArray.length - 1; f > -1; f--) {
			//System.out.println(testArray[f]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
 void StringPrintEveryOther(String testArray[]) {
		for(int j = 0; j < testArray.length; j++) {
			if((j % 2) == 0) {
				//System.out.println(testArray[j]);
			}
			
		}
	}

	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
 void StringPrintRandom(String testArray[]) {
		while(loop == true) {
			//random number
			ran = ron.nextInt(testArray.length);
			//random digit check
			
		 if(ran == 0 && !test1) {
	System.out.println(testArray[ran]);
	test1 = true;
}
else if(ran == 1 && !test2) {
	System.out.println(testArray[ran]);
	test2 = true;
}
else if(ran == 2 && !test3) {
	System.out.println(testArray[ran]);
	test3 = true;
}
else if(ran == 3 && !test4) {
	System.out.println(testArray[ran]);
	test4 = true;
}
else if(ran == 4 && !test5) {
	System.out.println(testArray[ran]);
	test5 = true;
}
else if(ran == 5 && !test6) {
	System.out.println(testArray[ran]);
	test6 = true;
}
else if(ran == 6 && !test7) {
	System.out.println(testArray[ran]);
	test7 = true;
}
else if(ran == 7 && !test8) {
	System.out.println(testArray[ran]);
	test8 = true;
}
else if(ran == 8 && !test9) {
	System.out.println(testArray[ran]);
	test9 = true;
}
else if(ran == 9 && !test10) {
	System.out.println(testArray[ran]);
	test10 = true;
}
else if(test1 == true && test2 == true && test3 == true && test4 == true && test5 == true && test6 == true && test7 == true &&
test8 == true && test9 == true && test10 == true) {
	loop = false;
}
else {
	ran = ron.nextInt(testArray.length);
}
			}

				
			
			
		
	}
	
}
