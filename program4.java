package Assignment4;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int vowel=0;
		int consonants=0;
		int special=0;
		System.out.print("Enter a string: ");
		String str= sc.nextLine();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i]=str.charAt(i);
		}
		for (char c : ch) {
			if((c >= 'a' && c <= 'z') || 
	                (c >= 'A' && c <= 'Z') ) {
			c = Character.toLowerCase(c);
			if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u')
				    vowel++;
                else
                	consonants++;
          }
			else {
				special++;
			}
		}	
		

		System.out.println("The Num of Vowel in your String is:-"+vowel);
		System.out.println("The Num of Consonants in your String is:-"+consonants);
		System.out.println("The Num of Special characters in your String is:-"+special);
		
	}

	}


