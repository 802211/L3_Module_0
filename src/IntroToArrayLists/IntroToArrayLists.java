package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList <String> array = new ArrayList <String>();
		//2. Add five Strings to your list
		array.add("a123");
		array.add("b123");
		array.add("c123");
		array.add("d123");
		array.add("e123");
		
		//3. Print all the Strings using a standard for-loop
		System.out.println("Print all the Strings using a standard for-loop");
		int x = array.size();
		for(int i = 0; i<x; i++){
			System.out.println(array.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("Print all the Strings using a for-each loop");
for(String y: array){
	System.out.println(y);
}
		//5. Print only the even numbered elements in the list.
System.out.println("Print only the even numbered elements in the list");
				for(int j = 0; j<x; j++){
			if(j % 2 == 0){
			System.out.println(array.get(j));
		}}
		//6. Print all the Strings in reverse order.
				System.out.println("Print all the Strings in reverse order");
		for(int a = x-1; a>-1; a--){
			System.out.println(array.get(a));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("Print only the Strings that have the letter 'e' in them.");
	}
}
