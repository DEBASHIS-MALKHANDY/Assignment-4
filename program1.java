package Assignment4;

import java.util.Arrays;

public class program1 {

	public static void main(String[] args) {
		String s="debashistechdebashis";
		int index=0;
		int i,j;
		
		char [] ch = new char[s.length()];
		
		for(i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);	
		}
		for(i=0;i<s.length();i++) {
			System.out.print(ch[i]);	
		}
		System.out.println();
		
		for(i=0;i<s.length();i++) {
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					break;
				}	
			}
			if(j==i) {
				 ch[index++] = ch[j];   	
			}
			   
					
		}	
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
		
    }
}
