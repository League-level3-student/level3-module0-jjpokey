package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		Random r = new Random();
		int x = 1000;
		int y = 1000;
		int p = 0;
		//1. make an array of 5 Strings
String[] s = new String[5];
		//2. print the third element in the array
System.out.println(s[2]);
		//3. set the third element to a different value
s[2] = "b";
		//4. print the third element again
		System.out.println(s[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < s.length; i++) {
			s[i] = "TAKE OVER!!!!";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int a = 0; a < s.length; a++) {
			System.out.println(s[a]);
		}
		//7. make an array of 50 integers
int[] e = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for(int z = 0; z < e.length;z++) {
	int ra = r.nextInt(1000);
	e[z] = ra;
}
		//9. without printing the entire array, print only the smallest number on the array
for(int q = 0; q < e.length; q++) {
	
	if(e[q] < x) {
y = e[q];
x = e[q];
	}
	
}
System.out.println("smallest number = " + y);
		//10 print the entire array to see if step 8 was correct
for(int g = 0; g < e.length;g++) {
	System.out.println(e[g]);
}
		//11. print the largest number in the array.
for(int o = 0; o < e.length; o++) {
	
	if(e[o] > p) {
y = e[o];
p = e[o];
	}
	
}
System.out.println("largest number = " + y);
		//12. print only the last element in the array
		System.out.println(e[e.length - 1]);
	}
}
